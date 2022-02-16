package listacliente;

public class Cliente {
    
    private String nome;
    private int id;
    private double saldo;
    
    public Cliente(){
    
    }
    
    public Cliente(String nome, int id, double saldo){
        this.setNome(nome);
        this.setId(id);
        this.setSaldo(saldo);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double s){
        this.saldo = s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + this.getNome() +"\n" + "Id: " + this.getId() + "\n" + "Saldo: " + this.getSaldo() + "\n");
        
        return sb.toString();
    }
    
    
    
}
