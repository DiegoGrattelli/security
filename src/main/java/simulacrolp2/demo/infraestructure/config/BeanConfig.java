/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.WebApplicationContext;
import simulacrolp2.demo.app.repository.LibrosRepository;
import simulacrolp2.demo.app.repository.TipoLibroRepository;
import simulacrolp2.demo.app.repository.UserRepository;
import simulacrolp2.demo.app.service.LibrosService;
import simulacrolp2.demo.app.service.LoginService;
import simulacrolp2.demo.app.service.LogoutService;
import simulacrolp2.demo.app.service.RegistrationService;
import simulacrolp2.demo.app.service.TipoLibroService;
import simulacrolp2.demo.app.service.UserService;

/**
 *
 * @author diego
 */
@Configuration
public class BeanConfig {
    
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public LibrosService librosService (LibrosRepository librosRepository){
        return new LibrosService (librosRepository);
    }
    
    @Bean
    public TipoLibroService tipoLibroService (TipoLibroRepository tipoLibroRepository){
        return new TipoLibroService (tipoLibroRepository);
    }
    
    @Bean 
    public UserService userService (UserRepository userRepository){
        return new UserService (userRepository);
    }
    
    @Bean
    public LoginService loginService(UserService userService){
        return new LoginService(userService);
    }
    @Bean
    public LogoutService logoutService(){
        return  new LogoutService();
    } 
    @Bean
    public RegistrationService registrationService(UserService userService, PasswordEncoder passwordEncoder){
        return  new RegistrationService(userService, passwordEncoder);
    }
}
