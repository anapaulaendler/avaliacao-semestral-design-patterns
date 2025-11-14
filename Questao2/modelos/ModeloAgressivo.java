package Questao2.modelos;

public class ModeloAgressivo extends Modelo {
    @Override
    public void calcularPerfilDeRisco(String nome, int idade) {
        System.out.println("Perfil de Risco Agressivo para " + nome + ", idade " + idade);
        System.out.println("Pontuação de Risco: " + randomNum);
    }
}
