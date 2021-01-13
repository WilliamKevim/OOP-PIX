public class CentralBank {
    public static void main (String[]args){
    }

    public consultarConta(){
        
    }

    public consultarCliente(){
        
    }

    public returnInf(){
        
    }

    public String gerarPIX(Cliente cliente, String tipo){
    if(tipo == "email"){
        return cliente.getEmail();
    } else if(tipo == "telefone"){
        return cliente.getTelefone();
    } else if (tipo == "aleatorio"){
        return "UUID";
    } else 
        return "Error";
    }

    public excluirPix(String pix){
        
    }
}
