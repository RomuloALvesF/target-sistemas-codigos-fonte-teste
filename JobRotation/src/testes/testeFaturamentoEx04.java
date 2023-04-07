package testes;

public class testeFaturamentoEx04 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double percSp = (sp / total) * 100;
        double percRj = (rj / total) * 100;
        double percMg = (mg / total) * 100;
        double percEs = (es / total) * 100;
        double percOutros = (outros / total) * 100;

        System.out.println("Percentual de representação de cada estado no faturamento total mensal:");
        System.out.println("SP: " + String.format("%.2f", percSp) + "%");
        System.out.println("RJ: " + String.format("%.2f", percRj) + "%");
        System.out.println("MG: " + String.format("%.2f", percMg) + "%");
        System.out.println("ES: " + String.format("%.2f", percEs) + "%");
        System.out.println("Outros: " + String.format("%.2f", percOutros) + "%");

    }
}
