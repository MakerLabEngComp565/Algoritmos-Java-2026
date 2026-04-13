
package com.mycompany.testaarrays;

import java.util.ArrayList;

public class TestaArrays {

    public static void main(String[] args) {
        // testa Array tradicional
        String[] mensagens = new String[5]; // indice de 0 a 4
        
       mensagens[0] = "Ola ";
       mensagens[1] = "Mundo - ";
       mensagens[2] = "aula ";
       mensagens[3] = "de ";
       mensagens[4] = "POO.";
       
      System.out.print(mensagens[0]);
      System.out.print(mensagens[1]);      
      System.out.print(mensagens[2]);
      System.out.print(mensagens[3]);  
      System.out.print(mensagens[4]);    
      System.out.println("");
      
      ArrayList<String> textos = new ArrayList<>();
      textos.add("Ola ");
      textos.add("Mundo - ");      
      textos.add("aula ");
      textos.add("de ");
      textos.add("Poo. ");
      textos.add("Meu nome eh Jader. ");      
      textos.add("O seu nome eh Paulo.");       
      System.out.print(textos.get(0));
      System.out.print(textos.get(1));      
      System.out.print(textos.get(2));
      System.out.print(textos.get(3));
      System.out.print(textos.get(4));
      System.out.print(textos.get(5));
      System.out.print(textos.get(6));      
      System.out.println("");

      
    }
}
