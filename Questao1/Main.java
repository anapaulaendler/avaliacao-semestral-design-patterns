package Questao1;

import Questao1.factory.RelatorioFactory;

public class Main {
    public static void main(String[] args) {
        RelatorioFactory factory = new RelatorioFactory();
        for (String nome : factory.getNomesRelatoriosDisponiveis()) {
            System.out.println("Criando relatório: " + nome);
            factory.criarRelatorio(nome).gerar();
        }
    }
}
