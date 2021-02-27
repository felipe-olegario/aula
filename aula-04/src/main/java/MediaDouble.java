
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
public class MediaDouble {
    
    public static Double ReturnMedia(Double num1, Double num2) {
        return (num1 + num2) /2;
    }
     public static Double ReturnMediaTres(Double num1, Double num2, Double num3) {
        return (num1 + num2 + num3) /3;
    }
    public static void main(String[] args) {
        Double num1, num2, num3, resultado1, resultado2;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        num1 = leitor.nextDouble();
        
        System.out.println("Digite outro Numero");
        num2 = leitor.nextDouble();
        
        System.out.println("digite o terceiro numero:");
        num3 = leitor.nextDouble();
        
        resultado1 = ReturnMedia(num1,num2);
        
        System.out.printf("A media entre %.1f e %.1f é %.1f", num1, num2, resultado1);
        
        System.out.println("");
        
        resultado2 = ReturnMediaTres(num1,num2,num3);
        
        System.out.printf("A media entre %.1f, %.1f e %.1f é %.1f", num1, num2, num3, resultado1);
        
    }
}
