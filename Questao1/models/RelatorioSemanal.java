package Questao1.models;

public class RelatorioSemanal extends Relatorio {
    @Override
    public void carregarDados() {
        System.out.println("Carregando dados semanais...");
    }

    @Override
    public void priorizarMetricas() {
        System.out.println("Priorizando métricas semanais...");
    }

    @Override
    public TipoFormato definirFormato() {
        System.out.println("Definindo formato do relatório semanal como CSV.");
        return TipoFormato.CSV;
    }
}