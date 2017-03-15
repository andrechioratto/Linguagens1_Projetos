package aula03;


public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
      
    public Conta(int numero, double saldo){
      this.numero = numero;
      this.saldo = saldo;
      this.titular = titular;
    }
void visualizarSaldo (){
    System.out.println("Saldo = " + this.saldo);
}
boolean depositar(double valor){
    if(valor>0){
        this.saldo = this.saldo + valor;
        return true;
    }else 
        return false;
    }
    
  /* void visualizarConta(){
       System.out.println("Nome do titular = " +this.titular.nome);
       System.out.println("sobrenome = "+this.titular.sobrenome );
       System.out.println("cpf = " + this.titular.cpf);
       System.out.println("saldo =" + this.saldo);
}*/
boolean sacar (double valor){
    if (valor >this.saldo|| valor<= 0){
       
        return false;
       
   }
    else{
         this.saldo = this.saldo - valor;
        return true;
    }
}
boolean transferirPara(Conta x,double valor){
    if (this.sacar(valor)){
        x.depositar(valor);
        System.out.println("Transferencia realizada");
        return true;
    }
    else
        System.out.println("Transferencia Não realizada");
    return false;
    
}

}

