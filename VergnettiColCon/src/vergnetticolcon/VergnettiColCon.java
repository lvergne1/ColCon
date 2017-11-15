/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vergnetticolcon;
import java.math.*;
/**
 *
 * @author lvergne1
 */
public class VergnettiColCon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
      for (int i = 1; i < 20000; i++){
          if (i%2!=0){
              for (int n = 1; n < 25; n++){
                if (i >= Math.pow(2, n) && i < Math.pow(2, n+1)){
                System.out.println("int: " + i + " power: " + n  + "Theta: " + (i - Math.pow(2,n))+"PI/" + Math.pow(2,n-1));
                
                }     
              }   
          }
      }
    }
    
}
