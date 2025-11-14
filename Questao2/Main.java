package Questao2;

import Questao2.contexto.ContextoModelo;
import Questao2.modelos.*;

public class Main {
    public static void main(String[] args) {
        ContextoModelo contexto = new ContextoModelo(new ModeloConservador());
        contexto.calcularPerfilDeRisco("Ana", 30);

        contexto.setModelo(new ModeloModerado());
        contexto.calcularPerfilDeRisco("Cauê", 45);

        contexto.setModelo(new ModeloAgressivo());
        contexto.calcularPerfilDeRisco("Lohanna", 25);
    }
}
