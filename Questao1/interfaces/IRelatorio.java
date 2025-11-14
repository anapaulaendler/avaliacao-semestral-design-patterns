package Questao1.interfaces;

import Questao1.models.TipoFormato;

public interface IRelatorio {
    void carregarDados();
    void priorizarMetricas();
    TipoFormato definirFormato();
}
