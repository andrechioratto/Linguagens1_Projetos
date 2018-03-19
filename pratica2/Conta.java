package pratica2;

/**
 *
 * @author 13.02642-9
 */
public class Conta {

    String numeroConta;
    String titular;
    float saldo;
    String CPF;

    void visualizarSaldo() {
        System.out.println("Saldo=" + this.saldo);
    }

    boolean depositar(float valor) {
        if (this.saldo<valor){
            return false;
        }else{
            this.saldo = this.saldo + valor;
            return true;
        }
    }

    boolean sacar(float valor) {
        if (this.saldo<valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    boolean transferirDinheiro(float valor ) {
        if (this.saldo<0 || this.saldo<valor){
            return false;         
        }else {
            this.saldo = this.saldo - valor;
            return true;
        }
        
    }

}
