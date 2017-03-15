package aula03;


public class Aula03 {

   
    public static void main(String[] args) {
   
        Conta c1 = new Conta();
        c1.numero = 1;
        c1.titular = new Cliente();
        c1.titular.nome = "andre";
        c1.titular.sobrenome = "melo";
        c1.titular.cpf ="222"
        c1.saldo = 1000;
        c1.visualizarSaldo ();
        c1.visualizarConta();
    }
    
}
