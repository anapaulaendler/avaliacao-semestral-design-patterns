package Questao2.contexto;

import Questao2.interfaces.IModelo;

public class ContextoModelo {
    private IModelo _modelo;

    public ContextoModelo(IModelo modelo) {
        setModelo(modelo);
    }

    public void setModelo(IModelo modelo) {
        this._modelo = modelo;
    }

    public void calcularPerfilDeRisco(String nome, int idade) {
        this._modelo.calcularPerfilDeRisco(nome, idade);
    }
}
