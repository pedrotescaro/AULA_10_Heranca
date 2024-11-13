public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1 = new Mensalista("José", "Rua abc n123", "Junior");
        Horista h1 = new Horista("Maria", "Rua 23 de maio", 10);

        m1.calcularSalario();
        System.out.println("MENSALISTA:" +m1.getNome());
        System.out.printf("INSS: %.2f%n", m1.calcularINSS());
        System.out.printf("IR: %.2f%n", m1.calcularIR());

        
        h1.calcularSalario();
        System.out.println("HORISTA:" +h1.getNome());
        System.out.printf("INSS: %.2f%n", h1.calcularINSS());
        System.out.printf("IR: %.2f%n", h1.calcularIR());
    }
}
