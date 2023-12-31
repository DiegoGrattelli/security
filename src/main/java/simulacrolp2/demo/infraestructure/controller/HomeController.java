/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author diego
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home(Model model, HttpSession httpSession) {

        try {
            model.addAttribute("id", httpSession.getAttribute("iduser").toString());
        } catch (Exception e) {
        }

        return "home";
    }
}