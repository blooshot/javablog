package com.bloodshot.blog.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    //show all
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listUsers", userService.getAllUsers());
        return "index";
    }


    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model){
        Users user = new Users();
        model.addAttribute("user", user);
        return "new_user";
    }


    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") Users users){
        userService.saveUser(users);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model){
        Users user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "update_user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") long id){
        userService.deleteUserById(id);
        return "redirect:/";
    }


    @RequestMapping(value = "/base", method=RequestMethod.GET)
    @ResponseBody
    public String createUser(){
        String va = "Sun Lode";
        System.out.println(va);
        return va;
    }
}
