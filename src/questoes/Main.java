package questoes;


import static questoes.Escada.escada;
import static questoes.ValidaSenha.validaSenha;

public class Main {

    public static void main(String[] args) {
        // Para testar insira as entradas das questões nas chamadas de função.
        System.out.println("---------Questão 1--------");
        escada(6); // Questão 1

        System.out.println("\n"+"---------Questão 2--------");
        validaSenha("Ya3&ab"); // Questão 2
    }
}
