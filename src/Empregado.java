public class Empregado{
    protected String nome;
    protected String endereço;
    protected double salario;

    public Empregado(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public double calcularINSS(){
        return(0.075 * salario);
    }

    public double calcularIR(){
        double ir = 0;
        if(salario < 2000){
            ir = 0.1 * salario;
        }else{
            ir = 0.28 * salario;
        }
        return ir;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getSalario() {
        return salario;
    }

   

}