/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.controller;

import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import simulacrolp2.demo.app.service.LibrosService;
import simulacrolp2.demo.app.service.TipoLibroService;
import simulacrolp2.demo.app.service.UserService;
import simulacrolp2.demo.infraestructure.entity.LibrosEntity;
import simulacrolp2.demo.infraestructure.entity.TipoLibroEntity;
import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
@Controller
@RequestMapping ("/user/libro")
public class LibrosController {
     private final LibrosService librosService;
     private final TipoLibroService tipoLibroService;
     private final UserService userService;

    public LibrosController(LibrosService librosService, TipoLibroService tipoLibroService, UserService userService) {
        this.librosService = librosService;
        this.tipoLibroService = tipoLibroService;
        this.userService = userService;
    }
     
     @GetMapping("/create")
     public String create (Model model,HttpSession httpSession){
         Iterable<TipoLibroEntity> Tipo = tipoLibroService.getTipo();
         model.addAttribute("ListTipos", Tipo);
         model.addAttribute("Id", httpSession.getAttribute("iduser").toString());
         return "/user/create";
     }
     
     @PostMapping("/save-create")
    public String create(Model model, LibrosEntity libros, @RequestParam("tipos_id") Integer tipos_id, HttpSession httpSession) throws IOException {
        TipoLibroEntity tipo = new TipoLibroEntity();
        UserEntity user = userService.findById(Integer.parseInt(httpSession.getAttribute("iduser").toString()));
        tipo.setId(tipos_id);
        libros.setTipoLibroEntity(tipo);
        libros.setUserEntity(user);
        librosService.saveLibros(libros);
        return "redirect:/home";
    }

   

    
}
             

