package Questao1.interfaces;

import java.util.List;

import Questao1.models.Relatorio;

public interface IRelatorioFactory {
    List<String> getNomesRelatoriosDisponiveis();
    Relatorio criarRelatorio(String nome);
}
