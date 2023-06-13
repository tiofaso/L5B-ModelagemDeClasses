package caixa;

public class Caixa {
    Double saldoCorrentista;

    public void credito(double entraDinheiro){
        saldoCorrentista = saldoCorrentista + entraDinheiro;
        System.out.println("Seu saldo atual é de R$" + saldoCorrentista);
    }

    public void debito(double tiraDinheiro){
        saldoCorrentista = saldoCorrentista - tiraDinheiro;
        System.out.println("Seu saldo atual é de R$" + saldoCorrentista);
    }

    public void ContaCorrente(){
        System.out.println("Seu saldo atual é: R$" + saldoCorrentista);
    }
}
