
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Tabuada {
    public static void main(String[] args) {
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        
        numero = leitor.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            int multiplicacao = i*numero;
            System.out.println(String.format("%d * %d = %d",i, numero, multiplicacao));
        }
    }
}
