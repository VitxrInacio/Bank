public class ContaPoupança extends Conta {

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("== EXTRATO CONTA POUPANÇA ==");
        super.imprimirInfComum();
        
    }


}
