package Exercicio2;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        
        candidatos.add(new Candidato("Maria", 0, 2, false));
        candidatos.add(new Candidato("João", 2, 5, true));
        candidatos.add(new Candidato("Ana", 0, 4, false));
        candidatos.add(new Candidato("Pedro", 0, 1, true));
        candidatos.add(new Candidato("Carlos", 3, 10, true));
        candidatos.add(new Candidato("Juliana", 0, 0, false));
        
        Avaliador avaliador = new Avaliador();
        
        List<String> resultados = avaliador.retornarNivel(candidatos);

        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}