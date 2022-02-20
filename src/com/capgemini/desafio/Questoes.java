package com.capgemini.desafio;


import static com.capgemini.desafio.ValidaSenha.validaSenha;

public class Questoes {
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


    public static void main(String[] args) {
        //escada(6); // Questão 1
        validaSenha("Ya3&ab");
    }
}
