package questoes;


import static questoes.Escada.escada;
import static questoes.ValidaSenha.validaSenha;

public class Main {

    public static void main(String[] args) {
        // Para testar insira as entradas das questões nas chamadas de função.
        System.out.println("---------Questão 1--------");
        escada(6); // Digite um valor na chamada da função para testar

        System.out.println("\n"+"---------Questão 2--------");
        System.out.println("TESTE COM A SENHA FRACA");
        System.out.println("--------------------------");

        validaSenha("Ya3"); // Digite uma possivel senha para testar a função

        System.out.println("\n"+"--------------------------");
        System.out.println("TESTE COM A SENHA FORTE");
        System.out.println("--------------------------");

        validaSenha("Ya3&ab"); // Digite uma possivel senha para testar a função
    }
}
