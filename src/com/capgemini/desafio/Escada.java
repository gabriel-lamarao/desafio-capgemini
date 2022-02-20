package com.capgemini.desafio;

public class Escada {
    public static void escada(int tamanho){
        for (int i = 0; i <= tamanho; i++) {
            for (int j = tamanho; j > 0; j--) {
                if(i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
