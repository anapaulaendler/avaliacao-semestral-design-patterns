package Questao2.modelos;

public class ModeloModerado extends Modelo {
    @Override
    public void calcularPerfilDeRisco(String nome, int idade) {
        System.out.println("Perfil de Risco Moderado para " + nome + ", idade " + idade);
        System.out.println("Pontuação de Risco: " + randomNum);
    }
}
