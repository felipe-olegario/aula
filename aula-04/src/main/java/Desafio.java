
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
public class Desafio {

    public static void leExibeMedia(int n) {
        int num1 = 0, media;
        
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            num1 = leitor.nextInt();
        }
        media = num1/n;
        System.out.println(+media);
    }
    public static void main(String[] args) {
        int num2;
        
         Scanner leitor = new Scanner(System.in);
        
        num2 = leitor.nextInt();
        
        leExibeMedia(num2);
    }
}
