package br.com.felipe.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// toda restcontroller tem apenas uma instancia
public class ContadorController {
    private  Integer acessos = 0;

    @GetMapping("acessos")
    public String obterAcessos() {
        acessos++;
        return "Acessos " + acessos;
    }
}
