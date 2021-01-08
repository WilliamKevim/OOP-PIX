public class Client {
    public conta Conta[];
    public String NR cpf;
    public String nome;
    public String email;
    public String numberTelefone;
    public listaAg AgenciasCad[];

    public Client(){
    }

    public Client(String NR cpf, String nome, String email, String numberTelefone){
        this.cpf = cpf; 
        this.nome = nome;
        this.email = email;
        this.numberTelefone = numberTelefone;  
    }

    public void setCpf(String NR novoCpf){
        cpf = novoCpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmail(String novoEmail){
        email = novoEmail;
    }

    public String getEmail(){
        return email;
    }

    public void setNumTelefone(String novoNumTelefone){
        numberTelefone = novoNumTelefone;
    }

    public String getNumTelefone(){
        return numberTelefone;
    }
}
