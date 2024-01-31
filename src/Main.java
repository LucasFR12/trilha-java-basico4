public class Main {

    public static void main(String[] args) {
        Cliente leandro = new Cliente();
        leandro.setNome("Leandro");

        Conta cc = new ContaCorrente(leandro);
        Conta poupanca = new ContaPoupanca(leandro);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        System.out.println("==================================================");
        cc.imprimirExtrato();
        System.out.println("==================================================");
        poupanca.imprimirExtrato();
        System.out.println("==================================================");
    }

}