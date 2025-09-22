import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Cálculo das médias bimestrais (2 notas por bimestre)
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        double mediaSemestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        double mediaSemestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Cálculo da média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibição dos resultados
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < 4; i++) {
            System.out.println("Média do " + (i + 1) + "º bimestre: " + mediasBimestrais[i]);
        }
        System.out.println("Média do 1º semestre: " + mediaSemestre1);
        System.out.println("Média do 2º semestre: " + mediaSemestre2);
        System.out.println("Média final: " + mediaFinal);

        input.close();
    }
}
