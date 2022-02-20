package com.capgemini.desafio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaSenha {
    public static void validaSenha(String senha){
        String temp = senha.strip(); // Remove espaços antes e depois da string e armazena em uma variavel temporaria

        String digito = "[0-9]"; // Encontra a poscição dos digitos
        String maiusculo = "[A-Z]"; // Encontra caracteres maiúsculos
        String minusculo = "[a-z]"; // Encontra caracteres minúsculos
        String especial = "[!@#$%^&*()-+]"; // Encontra cacarteres especiais
        int pendencias = 0; // Armazena quantos caracteres faltam para a senha ser segura
        boolean senhaForte = false;
        int contador = 0;


        // Os indices do array abaixo indicam a presenca de um tipo de caractere

        // posicao [0] representa a presença de um digito
        // posicao [1] representa a presença de um cacartere maiusculo
        // posicao [2] representa a presença de um cacartere minusculo
        // posicao [3] representa a presença de um caractere especial
        // posicao [4] representa a presença de no minimo 6 cacarteres
        int [] checkSenha = {0, 0, 0, 0, 0};


        // Compila as expressoes regulares
        Pattern regexDigito = Pattern.compile(digito);
        Pattern regexMaiusculo = Pattern.compile(maiusculo);
        Pattern regexMinusculo = Pattern.compile(minusculo);
        Pattern regexEspecial = Pattern.compile(especial);

        // Compara as expressoes regulares
        Matcher matcherDigito = regexDigito.matcher(temp);
        Matcher matcherMaiusculo = regexMaiusculo.matcher(temp);
        Matcher matcherMinusculo = regexMinusculo.matcher(temp);
        Matcher matcherEspecial = regexEspecial.matcher(temp);

        // indica a presença de um digito
        while (matcherDigito.find()){
            if (matcherDigito.start() > 0){
                checkSenha [0] = 1;
            }
        }

        // indica a presença de um caractere maiusculo
        while (matcherMaiusculo.find()){
            if (matcherMaiusculo.start() >= 0){
                checkSenha [1] = 1;
            }
        }

        // indica a presença de um caractere minusculo
        while (matcherMinusculo.find()){
            if (matcherMinusculo.start() >= 0){
                checkSenha [2] = 1;
            }
        }

        // indica a presença de um cacartere especial
        while (matcherEspecial.find()){
            if (matcherEspecial.start() >= 0){
                checkSenha [3] = 1;
            }

        }

        // valida o tamanho minimo
        if(temp.length() >= 6){
            checkSenha[4] = 1;
        }



        // posicao [0] representa um digito
        if (checkSenha [0] != 1){
            System.out.println("Requer um digito!");
            pendencias += 1;
        }
        // posicao [1] representa um cacartere maiusculo
        if (checkSenha [1] != 1){
            System.out.println("Requer um cacartere maiusculo!");
            pendencias += 1;
        }
        // posicao [2] representa um cacartere minusculo
        if (checkSenha [2] != 1){
            System.out.println("Requer um caractere minusculo!");
            pendencias += 1;
        }
        // posicao [3] representa um caractere especial
        if (checkSenha [3] != 1){
            System.out.println("Requer caractere especial!");
            pendencias += 1;
        }
        // posicao [4] representa o tamanho minimo da senha
        if (checkSenha [4] != 1){
            System.out.println("Requer no minimo 6 caracteres!");
            if (pendencias > 0){
                System.out.println("Senha fraca! Adicione " +  pendencias + " tipo(s) de caractere(s) pendente(s)!");
            }
        }

        for (int i : checkSenha) {
            if (i == 1) {
                contador += 1;
            }
            if (contador == 5) {
                senhaForte = true;
            }
        }
        if (senhaForte){
            System.out.println("Senha forte!");
        }

    }

}
