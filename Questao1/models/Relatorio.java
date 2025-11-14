package Questao1.models;

import Questao1.interfaces.IRelatorio;

public abstract class Relatorio implements IRelatorio {
    public final void preparar() {
        this.carregarDados();
        this.priorizarMetricas();
        this.definirFormato();
    }

    public void gerar() {
        this.preparar();
        System.out.println("Relatório gerado com sucesso.");
    }
}
