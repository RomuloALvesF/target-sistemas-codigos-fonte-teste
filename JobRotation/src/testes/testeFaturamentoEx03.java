package testes;

public class testeFaturamentoEx03 {
    public static void main(String[] args) {

        double[] faturamento = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
                46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614,
                0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318,
                1718.1221, 13220.495, 8414.61};


        double menor = faturamento[0];
        double maior = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] < menor) {
                menor = faturamento[i];
            }
            if (faturamento[i] > maior) {
                maior = faturamento[i];
            }
        }
        System.out.println("Menor  faturamento: " + menor);
        System.out.println("Maior  faturamento: " + maior);


        double soma = 0;
        int count = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > 0) {
                soma += faturamento[i];
                count++;
            }
        }
        double media = soma / count;


        int diasAcimaDaMedia = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > media) {
                diasAcimaDaMedia++;
            }
        }
        System.out.println("Número de dias em que o faturamento foi superior à média mensal: " + diasAcimaDaMedia);
    }
}


