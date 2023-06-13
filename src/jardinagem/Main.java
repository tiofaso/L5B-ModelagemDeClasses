package jardinagem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("+--------------------+");
        System.out.println("| DEDO VERDE SYSTEMS |");
        System.out.println("+--------------------+");

        System.out.println("\nCalcule o orçamento de adubagem e corte de grama\n");

        //Instanciando objeto
        Jardinagem meuJardim = new Jardinagem();
        Scanner entrada = new Scanner(System.in);

        //Infos do jardim
        System.out.println("Digite o nome do jardim do cliente:");
        meuJardim.nomeJardim = entrada.nextLine();

        System.out.println("Largura do terreno:");
        meuJardim.largTerreno = entrada.nextDouble();

        System.out.println("Comprimento do terreno:");
        meuJardim.compTerreno = entrada.nextDouble();

        meuJardim.qtdMetros = meuJardim.compTerreno * meuJardim.largTerreno; //área do terreno (metros)


        //Infos adubo
        meuJardim.valorAdubo = 44.99/20; //preço do adubo por 20kg


        //Infos da grama
        meuJardim.largPlacaGrama = 0.4; //Largura da placa de grama (metros)
        meuJardim.compPlacaGrama = 0.6; //Comprimento da placa de grama (metros)
        meuJardim.areaPlanta = meuJardim.compPlacaGrama * meuJardim.largPlacaGrama; //Área da placa de grama (metros)
        meuJardim.qtdMetrosGrama = meuJardim.areaPlanta * meuJardim.qtdMetros; //quantidade de grama a ser utilizada no terreno
        meuJardim.valorMetroGrama = 78.90/4; //Preço da placa de grama de 60x40

        //Formantando os números
        DecimalFormat ft = new DecimalFormat("0.00");


        System.out.println("\nCliente: " + meuJardim.nomeJardim);
        System.out.println("Valor do adubo (kg): R$" + (ft.format(meuJardim.valorAdubo)));
        System.out.println("Área do terreno: " + meuJardim.qtdMetros);
        System.out.println("Total de placas de grama (" + meuJardim.largPlacaGrama + " x " + meuJardim.compPlacaGrama + "):" + ft.format(meuJardim.qtdPlacaGrama(meuJardim.compTerreno, meuJardim.largTerreno, meuJardim.compPlacaGrama, meuJardim.largPlacaGrama)) + " placas");
        System.out.println("Quantida de grama (em metros) a ser utilizada " + meuJardim.qtdMetrosGrama);
        System.out.println("Quantidade de adubo a ser utilizada (kg): " + meuJardim.usarAdubo(meuJardim.qtdMetrosGrama));
        System.out.println("Preço do adubo utilizado: R$" + ft.format(meuJardim.precoAdubo(meuJardim.valorAdubo, meuJardim.qtdMetrosGrama)));
        System.out.println("Valor do corte e plantação da grama: R$" + ft.format(meuJardim.precoCorteGrama(meuJardim.qtdMetrosGrama, meuJardim.valorMetroGrama)));
    }
}
