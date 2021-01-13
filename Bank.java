public class Bank{
    public String codigo;
    public listaAgenca Agencia[];
    
    public Bank(){
    }

    public Bank(String codigo){
        this.codigo = codigo;    
    }

    public void setCodigo(String novoCodigo){
        codigo = novoCodigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getlistaAgenca(){
        return listaAgencia;
    }

    public criarNovaAg(String codigoAg){
        Agencia Agencianova = new Agencia();
        Agencianova.setCodigoAg(codigoAg);
        Agencia.setlistaclientes([]) 
        listaAgenca Agencia[Agencianova];
    }

    public deletarAg(String codigoAg){
        for(i=0; i < listadeagencia.length;++i){
            if (listadeagencia[i].getcodigoAg == codigoAg){
                listadeagencia[i].remove;
            }
        }
    }

    public consultarAg(){
        for(i=0; i < listadeagencia.length;++i){
            if (listadeagencia[i].getcodigoAg == codigoAg){
                return listadeagencia[i];
            }
        }
    }

}