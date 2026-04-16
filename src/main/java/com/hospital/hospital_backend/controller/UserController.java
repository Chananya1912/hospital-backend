
package com.hospital.hospital_backend.controller;
import java.util.Map;
import com.hospital.hospital_backend.model.User;
import com.hospital.hospital_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hospital.hospital_backend.util.JwtUtil;
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository repo;
    
    @GetMapping("/")
    public String home() {
        return "Backend is running 🚀";
    }
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return repo.save(user);

    }



    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {

        User existingUser = repo.findByUsername(user.getUsername());

        if (existingUser == null) {
            return Map.of("message", "User not found");
        }

        if (!existingUser.getPassword().equals(user.getPassword())) {
            return Map.of("message", "Invalid password");
        }

        String token = JwtUtil.generateToken(user.getUsername());

        return Map.of(
                "token", token,
                "role", existingUser.getRole()
        );
    }
    @GetMapping("/profile")
    public String getProfile(@RequestHeader("Authorization") String token) {

        // "Bearer xyz..." → token extract
        String actualToken = token.substring(7);

        String username = JwtUtil.extractUsername(actualToken);

        return "Welcome " + username;
    }
}

