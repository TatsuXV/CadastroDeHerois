package dev.Projeto.CadastroDeHerois;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/Bem-vindo")
    public String Boasvinda(){
        return "Essa é a minha primeira mensagem";
    }
}
