
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
public class ExemploMetodo {
    
    public static void exibeNumero(int num) {
        System.out.println(+num);
    }
    public static void exibeAsterisco(String frase) {
        System.out.println("vai"+frase);
    }
    //para criar funções que retornam valores você precisa tirar o void
    
    public static int retornaValor(int a, int b) {
        return a+b;
    }
    public static int retornaMaior(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        int num1, num2, resultado, maior;
        
        Scanner leitor = new Scanner(System.in);
        
        exibeAsterisco(" toma");
        exibeNumero(10);
        
        System.out.println("digite um numero:");
        
        num1 = leitor.nextInt();
        
        System.out.println("digite outro numero:");
        
        num2 = leitor.nextInt();
        
        resultado = retornaValor(num1, num2);
        
        System.out.printf("a soma entre %d + %d = %d", num1, num2, resultado);
        
        maior = retornaMaior(num1,num2);
        
        System.out.println("O maior numero é "+maior);
        
    }
   
}
