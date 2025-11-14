package Questao2.modelos;

public class ModeloConservador extends Modelo {
    @Override
    public void calcularPerfilDeRisco(String nome, int idade) {
        System.out.println("Perfil de Risco Conservador para " + nome + ", idade " + idade);
        System.out.println("Pontuação de Risco: " + randomNum);
    }
}
