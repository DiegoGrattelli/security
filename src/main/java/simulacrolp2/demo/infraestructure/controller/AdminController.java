/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import simulacrolp2.demo.app.service.LibrosService;
import simulacrolp2.demo.infraestructure.entity.LibrosEntity;

/**
 *
 * @author diego
 */
@Controller
@RequestMapping ("/admin")
public class AdminController {
 private final LibrosService librosService;

    public AdminController(LibrosService librosService) {
        this.librosService = librosService;
    }
 
 @GetMapping
 public String home (){
     return "/admin/home_admin";
 }
 
 @GetMapping("/show")
 public String show (Model model){
     Iterable <LibrosEntity> libro = librosService.getLibros();
     model.addAttribute("libros", libro);
     
     return "/admin/show" ;
             
 }
 @GetMapping("/delete/{id}")
    public String deletelibro(@PathVariable Integer id){
        librosService.deleteLibrosById(id);
        return "redirect:/admin/show";
    }
    
     @GetMapping("/edit/{id}")
    public String editlibro(@PathVariable Integer id, Model model){
        LibrosEntity libros = librosService.getLibrosById(id);
        model.addAttribute("libros",libros);
        return "/admin/edit";
    }
    
    
}
