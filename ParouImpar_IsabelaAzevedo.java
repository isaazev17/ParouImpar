/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar_isabelaazevedo;

import java.util.Scanner;

/**
 *
 * @author Isabela
 */
public class ParouImpar_IsabelaAzevedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Scanner entrada;
     int num;
     entrada = new Scanner (System.in);
     System.out.print("Digite um número:" );
     num = entrada.nextInt();
     
     if(num %2 == 0){
     
    System.out.println("O número é par");
    }
        
     else {
   
    System.out.println("O número é ímpar"); 
     
    }
     
     
    }
     
     
    
}
