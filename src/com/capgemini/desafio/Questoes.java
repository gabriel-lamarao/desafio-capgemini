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

        String temp = senha.strip();

        if(temp.length() < 6){
            System.out.println("A senha precisa ter pelo menos 6 caracteres!");
        }

        // um minusculo
        // um maiusculo
        // um caractere especial
        String regexDigito = "\\d"; // Encontra a poscição dos digitos
        String regexMinMai = "[a-zA-Z]";

        Pattern pattern = Pattern.compile(regexDigito);
        Matcher matcher = pattern.matcher(senha);

        System.out.println("Senha:  " + senha);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() +" ");
        }



    }


    public static void main(String[] args) {
        //escada(6); // Questão 1
        verificaSenha("AabB#1@");
    }
}
