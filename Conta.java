public class Conta {
    private double saldo;
    private listaPix[] Pix[];
    private String numero;

    public Conta(){
    }

    public Conta(float saldo,String numero){
        this.saldo = saldo; 
        this.numero = numero; 
    }


    private boolean saque(double valorsaque){
        if (valorsaque <= saldo){
            saldo -= valorsaque;
            return true;
        }else return false;
    }

    private boolean deposito(double valordeposito){
        if (valordeposito > 0){
            saldo += valordeposito;
            return true;
        }else return false;
    }

    public boolean transferencia(String pix, double valortransferencia){
        Cliente cliente = CentralBank.consultarCliente(pix);
        if(cliente instanceof ContaSalario){
            if(getpix() == cliente.getEmpregador().getpix()){
                return cliente.depositar(valortransferencia);
            }
        else{
            return cliente.depositar(valortransferencia);
        }
    }
}
