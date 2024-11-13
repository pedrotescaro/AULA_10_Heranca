public class Horista extends Empregado{
    private int horas;

    public Horista(String nome, String endereço,int horas) {
        super(nome, endereço);
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = horas * 50;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    

}