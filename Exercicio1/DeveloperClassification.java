package Exercicio1;
public class DeveloperClassification {

    public String classify(int years, int projects) {
        if (years < 0 || projects < 0) {
            throw new IllegalArgumentException("Os valores de anos de experiência e quantidade de projetos não podem ser negativos.");
        }
        if (years < 1 && projects < 2) {
            return "Estagiário";
        } else {
            return "Júnior";
        }
    }
}
