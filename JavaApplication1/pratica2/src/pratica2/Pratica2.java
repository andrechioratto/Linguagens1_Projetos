
package pratica2;

/**
 *
 * @author 13.02642-9
 */
public class Pratica2 {



    public static void main(String[] args) {
        Conta c1 = new Conta("219029",1000,"andre");               
        c1.visualizarSaldo();
        
        
        Conta c2 = new Conta("293891",2000,"carlos");       
        c2.visualizarSaldo();
        
        c1.transferirPara(c2,500);
        c1.visualizarSaldo();
        c2.visualizarSaldo();
       
    }

}
