package exercicioBanco;

public class Main {

    public static void main(String[] args) {
        cliente Flavia = new cliente();
        Flavia.setNome("Flavia");

        conta cc = new contaCorrente(Flavia);
        conta poupanca = new contaPoupanca(Flavia);

        cc.depositar(500);
        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

