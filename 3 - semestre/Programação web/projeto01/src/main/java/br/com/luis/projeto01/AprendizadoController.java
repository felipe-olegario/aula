package br.com.luis.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AprendizadoController {

    //@GetMapping transforma um metodo em endpoint ou query
    @GetMapping()
    public String frase(){
        return "e nois no Spring Boot";
    }
    @GetMapping("falou")
    public String despedida(){
        return "tchau tchai";
    }

    @GetMapping("somar/{n1}/{n2}")
    public String somar(@PathVariable Double n1, @PathVariable Double n2){
        return "a soma é " + (n1+n2);
    }

    @GetMapping("quadrado/{num}")
    public String quadrado(@PathVariable Integer num){
        return num + " ao quadrado é:    " + (num * num);
    }

    @GetMapping("dividir/{n1}/{n2}")
    public String dividir(@PathVariable Integer n1, @PathVariable Integer n2){
        if(n2 == 0) {
            return "Não posso dividir por zero!!";
        } else {
            return n1 + "/" + n2 + " = " + (n1/n2);
        }
    }

    @GetMapping("resultado/{estudante}/{n1}/{n2}")
    public String resultado(@PathVariable Double n1,
                            @PathVariable Double n2,
                            @PathVariable String estudante){
        if(n1/n2 <= 6) {
            return estudante + " infelizmente você não passou";
        } else {
            return "Muito bem, " + estudante + " você passou de semestre";
        }
    }
}
