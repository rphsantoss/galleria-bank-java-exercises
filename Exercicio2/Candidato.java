package Exercicio2;

public class Candidato {
    private String nome;
    private int anosExperiencia;
    private int quantidadeProjetos;
    private boolean conheceSpring;

    public Candidato(String nome, int anosExperiencia, int quantidadeProjetos, boolean conheceSpring) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.quantidadeProjetos = quantidadeProjetos;
        this.conheceSpring = conheceSpring;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public int getQuantidadeProjetos() {
        return quantidadeProjetos;
    }

    public boolean isConheceSpring() {
        return conheceSpring;
    }
}