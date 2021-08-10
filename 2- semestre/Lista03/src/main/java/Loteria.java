
import java.util.Scanner;
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
public class Loteria {
    public static void main(String[] args) {
        int numero, cont = 1, numAleatorio = 0;
        
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número de 1 a 10");
        
        numero = leitor.nextInt();
        
        while(numero != numAleatorio) {
            numAleatorio = ThreadLocalRandom.current().nextInt(1,10);
            System.out.println("aleatorio = "+numAleatorio);
            System.out.println("contador = "+cont);
            cont++;
            
            if(cont <= 3) {
                System.out.println("Você é muito sortudo");
            } else if (cont <= 10) {
                System.out.println("Você é sortudo");
            }
        }
        
        
    }
}
