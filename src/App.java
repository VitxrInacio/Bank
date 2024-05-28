public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta pp = new ContaPoupança();


        cc.imprimirExtrato();
        pp.imprimirExtrato();
        
    }
}
