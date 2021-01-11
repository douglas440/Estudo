package aula14outubro;

import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner pessoa = new Scanner(System.in);
        
        System.out.print("Informe a nota da prova: ");
        float nota1 = pessoa.nextFloat();
        System.out.print("Informe a nota do trabalho: ");
        float notat = pessoa.nextFloat();
        
        float media = (nota1 + notat)/2;
        
        if (media >= 7){
            System.out.println("Voce foi aprovado com "+media+" pontos, PARABENS!!!");
        }
        else if (media < 7){
            System.out.println("Recuperação, Vamos estudar!!!");
                    }
        else if (media < 5){
            System.out.println("reprovado!");
        }
    }
}
