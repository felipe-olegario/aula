
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
public class ExemploSwitCase {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer diaDaSemana, posicao;
        
        System.out.println("Digite o dia da semana de 1 a 7:");
        
        diaDaSemana = leitor.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
                
            case 2:
                System.out.println("Segunda");
                break;    
                
            case 3:
                System.out.println("Terça");
                break;
                
            case 4:
            System.out.println("Quarta");
            break;
            
            case 5:
                System.out.println("Quinta");
                break;
            
            case 6:
                System.out.println("Sexta");
                break;
                
            case 7:
                System.out.println("Sabado");
                break;
                
            default: 
                System.out.println("Dia da semana invalido");
                break;
        }
        
        System.out.println("Qual a sua posição no concurso?");
        
        posicao = leitor.nextInt();
        
        System.out.print("Você ganhou ");
        
        switch(posicao) {
            case 1:
                System.out.print("um iphone, ");
                
            case 2:
                System.out.print("um ipad e ");
                
            case 3:
                System.out.print("um ipod");
                break;
                
            default:
                System.out.print("Nada");     
        }
        
    }

}
