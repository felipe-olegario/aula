package br.com.felipe.desafio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesafioController {
    private Integer contador = 0;
    private Integer passageiros = 0;
    @GetMapping("entrar/{quantidade}")
    public String entrar(@PathVariable Integer quantidade) {
        if(contador > 12) {
            return "Limite de 12 atingido";
        } else {
            contador++;
            passageiros += quantidade;
            return "entrou " + quantidade;
        }
    }

    @GetMapping("consultar/passageiros")

    public String consultar() {
        if(contador == 0) {
            return "Nenhum registro entrou ainda";
        } else {
            return "Existem " + passageiros + " passageiros no sistema";
        }
    }
}
