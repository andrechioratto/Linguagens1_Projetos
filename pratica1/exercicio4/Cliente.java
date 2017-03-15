
package aula03;


public class Cliente {
  
      private String nome;
      private String sobrenome;
      private String cpf;
       
    
      public Cliente (String nome,String cpf,String sobrenome){
          this.cpf = cpf;
          this.sobrenome = sobrenome;
          this.nome = nome;
      }
      
     void visualizarConta(){
       System.out.println("Nome do titular = " +this.nome);
       System.out.println("sobrenome = "+this.sobrenome );
       System.out.println("cpf = " + this.cpf);
}
}