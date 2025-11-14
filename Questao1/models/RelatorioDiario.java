package Questao1.models;

public class RelatorioDiario extends Relatorio {
    @Override
    public void carregarDados() {
        System.out.println("Carregando dados diários...");
    }

    @Override
    public void priorizarMetricas() {
        System.out.println("Priorizando métricas diárias...");
    }

    @Override
    public TipoFormato definirFormato() {
        System.out.println("Definindo formato do relatório diário como PDF.");
        return TipoFormato.PDF;
    }
}