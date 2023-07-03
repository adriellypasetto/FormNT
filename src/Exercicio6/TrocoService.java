package Exercicio6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TrocoService {

   public double custo = 17.35;
   public double pagamento = 20.00;

    public double valorTroco (double custo, double pagamento){
        double valorTroco = pagamento - custo;

        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        String stringFormatada = df.format(valorTroco);
        double troco = Double.parseDouble(stringFormatada);

        return troco;
    }

    public String quantidadeNotas (double troco){

        int quantidadeNotas;
        int[] notaTroco = new int[]{100, 50, 20, 10, 5, 2, 1};
        int valorInteiro = (int) troco;

        int i = 0;
        List<String> resultado = new ArrayList<>();
        while (valorInteiro != 0){
            int numeroDeNotas = valorInteiro / notaTroco[i];
            if (numeroDeNotas != 0){
                String notas = numeroDeNotas + " nota(s) de R$ " + notaTroco[i] + "\n";
                valorInteiro = valorInteiro % notaTroco[i];
                resultado.add(notas);
            }
            i++;
        }
        return resultado.toString();
    }

    public String quantidadeMoedas (double troco){

        int quantidadeMoedas;
        int[] centavosTroco = new int[]{50, 25, 10, 5, 1};
        int valorCentavo = (int)Math.round((troco - (int)troco) * 100);

        int i = 0;
        List<String> resultado = new ArrayList<>();
        while (valorCentavo != 0){
            int numeroDeMoedas = valorCentavo / centavosTroco[i];
            if (numeroDeMoedas != 0){
                String centavos = numeroDeMoedas + " moeda(s) de R$ 0." + centavosTroco[i] + "\n";
                valorCentavo = valorCentavo % centavosTroco[i];
                resultado.add(centavos);
            }
            i++;
        }
        return resultado.toString();


       }

    public void imprime(){
        System.out.println("Custo: " + custo + "\n");

        System.out.println("Pagamento: " + pagamento + "\n");

        System.out.println("Menor troco:");
        System.out.println(quantidadeNotas(valorTroco(custo,pagamento)).replace("[",  "  " ).replace("]" , " ").replace("," , " "));
        System.out.println(quantidadeMoedas(valorTroco(custo,pagamento)).replace("[", "  ").replace("]" , " ").replace("," , " "));



    }



  }



