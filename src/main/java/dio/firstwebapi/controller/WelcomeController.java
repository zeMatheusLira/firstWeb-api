package dio.firstwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// controller do tipo spring
public class WelcomeController {

    @GetMapping// mapear o metodo -> recurso http
    public String welcome() {
        return "Welcome to my Spring Boot Web API";
    }
}
