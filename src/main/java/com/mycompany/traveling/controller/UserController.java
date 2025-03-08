package com.mycompany.traveling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.mycompany.traveling.service.UserService;

import org.springframework.ui.Model;








@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

   
    @GetMapping("/dsSinhVien")
    public String showSinhVienPage(Model model) {
    
         model.addAttribute("dssv", "hello");
        return "signin"; // Trả về file `sinhvien.html`
    }

    // @GetMapping("/{id}")
    // public User getUserById(@PathVariable Long id) {
    //     return userService.getUserById(id);
    // }

    // @PostMapping
    // public User createUser(@RequestBody User user) {
    //     return userService.createUser(user);
    // }

    // @PutMapping("/{id}")
    // public User updateUser(@PathVariable Long id, @RequestBody User user) {
    //     return userService.updateUser(id, user);
    // }

    // @DeleteMapping("/{id}")
    // public void deleteUser(@PathVariable Long id) {
    //     userService.deleteUser(id);
    // }
}