
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class ExemploFor {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {;
            System.out.println(String.format("Contador = %d", i));
        }

        for (int i = 7; i >= 1; i--) {
            System.out.println(String.format("Contador = %d", i));
        }

        System.out.println("Exibindo de 1 a 7 usando " + "do while");

        int i = 1;

        do {
            System.out.println(String.format("Contador %d", i));
            i++;
        } while (i <= 7);
        
        int numAleatorio = ThreadLocalRandom.current().nextInt(1,6);
        
        System.out.println("Numero aleatório"+numAleatorio);

    }

}
