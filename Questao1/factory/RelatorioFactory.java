package Questao1.factory;

import java.util.*;
import java.util.function.Supplier;

import Questao1.interfaces.IRelatorioFactory;
import Questao1.models.*;

/* 
Caso pareça que o código é familiar, é porque reutilizei a estrutura de Factory
do exercício de RPG para esse exercício.
*/ 
public class RelatorioFactory implements IRelatorioFactory {
    private final Map<String, Supplier<Relatorio>> registroRelatorios;

    public RelatorioFactory() {
        this.registroRelatorios = new HashMap<>();
        registrarRelatoriosPadrao();
    }

    private void registrarRelatoriosPadrao() {
        registrarRelatorio("RelatorioDiario", RelatorioDiario::new);
        registrarRelatorio("RelatorioEmergencial", RelatorioEmergencial::new);
        registrarRelatorio("RelatorioSemanal", RelatorioSemanal::new);
    }
    
    private void registrarRelatorio(String nome, Supplier<Relatorio> fabrica) {
        registroRelatorios.put(nome, fabrica);
    }
    
    public List<String> getNomesRelatoriosDisponiveis() {
        List<String> nomes = new ArrayList<>(registroRelatorios.keySet());
        Collections.sort(nomes); 
        return nomes;
    }
    
    public Relatorio criarRelatorio(String nome) {
        Supplier<Relatorio> fabrica = registroRelatorios.get(nome);
        if (fabrica == null) {
            throw new IllegalArgumentException("Relatório não encontrado: " + nome);
        }
        return fabrica.get();
    }
}