package aula03;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, String nome, String sobrenome, String cpf, double saldo) {
        this.titular = new Cliente(nome, sobrenome, cpf);
        this.numero = numero;
        this.saldo = saldo;

    }

    public int getNumero() {
        return this.numero;

    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public double getSaldo() {
        return this.saldo;
    }

    void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public void visualizarConta() {

        Cliente a = new Cliente("a", "b", "c");
        String b = a.getCpf();
        String c = a.getNome();
        String d = a.getSobrenome();
        System.out.println("Nome do titular = " + c);
        System.out.println("sobrenome = " + d);
        System.out.println("cpf = " + b);
        System.out.println("saldo =" + this.saldo);
    }

    boolean sacar(double valor) {
        if (valor > this.saldo || valor <= 0) {

            return false;

        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    boolean transferirPara(Conta x, double valor) {
        if (this.sacar(valor)) {
            x.depositar(valor);
            System.out.println("Transferencia realizada");
            return true;
        } else {
            System.out.println("Transferencia Não realizada");
        }
        return false;

    }

}
