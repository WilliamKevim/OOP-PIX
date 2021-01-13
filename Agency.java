public class Agency{
    public String codigoAg;
    public listaClients Client[];
    
    public Agency(){
    }

    public Agency(String codigoAg){
        this.codigoAg = codigoAg;    
    }

    public void setCodigoAg(String novoCodigoAg){
        codigoAg = novoCodigoAg;
    }

    public String getCodigoAg(){
        return codigoAg;
    }

    public void criarCliente(String cpf, String nome, String email, String numberTelefone){
        Cliente clientenovo = new Cliente(cpf,nome,email,numberTelefone,listaAg AgenciasCad[]);
        listaClients Client[clientenovo];
    }
    public deletarCliente(String cpf){
        for(i=0; i < Cliente(s).length;++i){
            if Cliente{i}.getCpf == cpf do parametro;
        }
    }
    public consultarCliente(String cpf){
        for(i=0; i < Cliente(s).length;++i){
            if Cliente{i}.getCpf == cpf do parametro;
             return Cliente(s)
        }
        return new Cliente();
    }
    public saldoAg(){
        pegarsaldo = 0;
        for(i = 0; i < Cliente(s).length;++i){
           for( j=0; j < Cliente[i].getContas().length;j++{
               pegarsaldo = Cliente[i].getContas().((j).getSaldo);
           }
        }  
        return pegarsaldo;
    }
}