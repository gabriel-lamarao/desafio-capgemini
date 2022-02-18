package com.capgemini.desafio;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static void verificaSenha(String senha){
        // um digito
        // um minusculo
        // um maiusculo
        // um caractere especial



        String temp = senha.strip();

        if(temp.length() < 6){
            System.out.println("A senha precisa ter pelo menos 6 caracteres!");
        }


    }


    public static void main(String[] args) {
        //escada(6); // Questão 1
        verificaSenha("A");
    }
}
