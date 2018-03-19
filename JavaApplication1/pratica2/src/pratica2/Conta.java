/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica2;

/**
 *
 * @author 13.02642-9
 */
public class Conta {

    private String CPF;
    private double saldo;
    private String titular;
    private int numeroConta;

    public Conta(String CPF, double saldo, String titular) {
        this.titular = titular;
        this.CPF = CPF;
        this.saldo = saldo;

    }

    void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;

    }

    public void visualizarConta() {

        /*    Cliente a = new Cliente("a", "b", "c");
        String b = a.getCpf();
        String c = a.getNome();
        String d = a.getSobrenome();
        System.out.println("Nome do titular = " + c);
        System.out.println("sobrenome = " + d);
        System.out.println("cpf = " + b);
         */ System.out.println("saldo =" + this.saldo);
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return true;

        } else {
            return false;
        }
    }

    boolean transferirPara(Conta destino, double valor) {
        boolean resp = false;
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferencia realizada");
            resp = true;
        } else {
            System.out.println("Transferencia Não realizada");
        }
        return resp;

    }

}
