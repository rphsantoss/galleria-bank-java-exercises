package Exercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeveloperClassification developerClassification = new DeveloperClassification();

        try {
            System.out.print("Quantos anos de experiência você tem em programação? ");
            int years = scanner.nextInt();

            System.out.print("Quantos projetos você já participou? ");
            int projects = scanner.nextInt();

            String classification = developerClassification.classify(years, projects);
            System.out.println("Classificação: " + classification);
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de formato! Digite apenas números inteiros positivos!.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Entrada inválida! " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
