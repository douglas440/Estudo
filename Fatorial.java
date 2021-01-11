package estrurepetiçao;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Fatorial {
    public static void main(String[]args){
        Scanner usuario = new Scanner (System.in);
        System.out.println("digite o numero pra ver o fatorial: ");
        int num = usuario.nextInt();
        int fat = 1;
        int cont = num;
        
        while(cont >= 1){
            fat *= cont;
            cont --;
        }
        System.out.println("O fatorial de "+ num +" é "+ fat);
                
    }
}
