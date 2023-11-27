/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import simulacrolp2.demo.app.service.LoginService;
import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final LoginService loginService;
    private final Integer USER_NOT_FOUND = 0;

    @Autowired
    private HttpSession httpSession;

    public UserDetailServiceImpl(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Integer idUser = loginService.getUserId(username);
        if (idUser != USER_NOT_FOUND) {
            UserEntity user = loginService.getuser(username);
            httpSession.setAttribute("iduser", user.getId());
            httpSession.setAttribute("name", user.getName());
            return org.springframework.security.core.userdetails.User.builder().username(user.getName()).password(user.getContraseña()).roles(user.getUserType().name()).build();
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado ");
        }

    }

}
