package Exercicio2;
import java.util.ArrayList;
import java.util.List;

public class Avaliador {

    public List<String>  retornarNivel(List<Candidato> candidatos) {
        List<String> resultados = new ArrayList<>();
        for (Candidato candidato : candidatos) {
            String nivel = classificar(candidato);
            resultados.add(candidato.getNome() + " - " + nivel);
        }
        return resultados;
    }

    private String classificar(Candidato candidato) {
        int pontos = 0;
        
        pontos += candidato.getAnosExperiencia(); // cada ano = 1 ponto
        pontos += candidato.getQuantidadeProjetos() / 2; // cada 2 projetos = 1 ponto
        if (candidato.isConheceSpring()) {
            pontos += 2; // Spring vale 2 pontos
        }
        
        return pontos >= 3 ? "Júnior" : "Estagiário";
    }
}