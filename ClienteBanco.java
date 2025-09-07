public class ClienteBanco {
    private String nome;
    private String tipoConta;

    public void setNome (String nome){
        this.nome = nome;
    } 

    public String getNome(){
        return nome;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    public String getTipoConta(){
        return tipoConta;
    }
}