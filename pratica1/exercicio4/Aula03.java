package aula03;


public class Aula03 {

   
    public static void main(String[] args) {
        Cliente c2 = new Cliente (a,s,c);
        Conta c1 = new Conta(1,1000);
        
       /* c1.titular.nome = "";
        c1.titular.sobrenome = "";
        c1.titular.cpf =""
        c1.saldo = 1000;
        c1.visualizarSaldo ();
        c1.visualizarConta();
        
        Conta c2 = new Conta();
        c2.numero = 2;
        c2.titular = new Cliente();
        c2.titular.nome = "andre";
        c2.titular.sobrenome = "melo";
        c2.titular.cpf ="222"
        c2.saldo = 1000;
        c2.visualizarSaldo ();
        c2.visualizarConta();*/
       c1.titular.visualizarConta();
    }
    
}
