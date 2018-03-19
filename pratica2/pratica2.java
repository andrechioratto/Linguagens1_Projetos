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
public class pratica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta minhaConta = new Conta();
        c1.saldo = 1000;
        c1.CPF = "389138910389";
        c1.visualizarSaldo();
        minhaConta.saldo = 1800;
        minhaConta.visualizarSaldo();
    }

}
