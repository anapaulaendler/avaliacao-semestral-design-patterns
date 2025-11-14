package Questao1.models;

public class RelatorioEmergencial extends Relatorio {
    @Override
    public void carregarDados() {
        System.out.println("Carregando dados emergenciais...");
    }

    @Override
    public void priorizarMetricas() {
        System.out.println("Priorizando métricas emergenciais...");
    }

    @Override
    public TipoFormato definirFormato() {
        System.out.println("Definindo formato do relatório emergencial como TXT.");
        return TipoFormato.TXT;
    }
}