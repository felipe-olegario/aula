package br.com.felipe.projeto03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
public class PaisController {
    @GetMapping("exemplo")
    public Pais getExemplo() {
        Pais exemplo = new Pais("Canadá", 4, 2, 1);
        return exemplo;
    }

    @GetMapping("top3")
    public  List<Pais> getTop3() {
        List<Pais> top3 = List.of(
                new Pais("EUA", 40, 20, 10),
                new Pais("China", 20, 10, 5),
                new Pais("Brasil", 35, 15, 12)
        );
        return top3;
    }

    @GetMapping("/cadastrar/{pais}/{ouro}/{prata}/{bronze}")
    public String cadastrar(@PathVariable String pais,
                            @PathVariable Integer ouro,
                            @PathVariable Integer prata,
                            @PathVariable Integer bronze) {
        Pais novoPais = new Pais(pais, ouro, prata, bronze);
        return "Cadastrado com sucesso";
    }
}
