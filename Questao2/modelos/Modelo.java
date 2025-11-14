package Questao2.modelos;

import Questao2.interfaces.IModelo;

public abstract class Modelo implements IModelo {
    int randomNum = (int)(Math.random() * 101);
}
