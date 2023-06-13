package jardinagem;

public class Jardinagem {
    //Dados em string
    String nomeJardim;

    //Dados fundamentais
    double qtdMetros;
    double largTerreno;
    double compTerreno;
    double largPlacaGrama;
    double compPlacaGrama;

    double areaPlanta;
    double qtdMetrosGrama;
    double gramaAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;

    public double usarAdubo(double qtdMetrosGrama ){//Quanto adubo é usado
        gramaAdubo = 50 * qtdMetrosGrama; //50g de adubo a cada metro
        return gramaAdubo/1000; //preço por kg
    }
    public double precoAdubo(double valorAdubo, double qtdMetrosGrama){
        double aduboUsado = usarAdubo(qtdMetrosGrama);
        return (valorAdubo * aduboUsado);
    }
    public double precoCorteGrama(double qtdMetrosGrama, double valorMetroGrama){
        valorConteGrama = qtdMetrosGrama * valorMetroGrama;
        return valorConteGrama;
    }

    public double qtdPlacaGrama(double largTerreno, double compTerreno, double largPlacaGrama, double compPlacaGrama){
        this.largTerreno = largTerreno;
        this.compTerreno = compTerreno;
        this.compPlacaGrama = compPlacaGrama;
        this.largPlacaGrama = largPlacaGrama;

        double totalPlacasComprimento = this.compTerreno / this.compPlacaGrama;
        double totalPlacasLargura = this.largTerreno / this.largPlacaGrama;

        double totalPlacasGrama = totalPlacasComprimento + totalPlacasLargura;

        return totalPlacasGrama;




    }

}
