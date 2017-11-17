
package vergnetticolcon;
import java.math.*;
/**
 *
 * @author lvergne1
 */
public class VergnettiColCon {

    public static void main(String[] args) {
        int[] angle = new int[2];
              Transform(129,0);


    }
    
    public static int[] toAngle(int i){
        int[] angle = new int[2]; 
        for (int n = 1; n < 25; n++){
            if (i >= Math.pow(2, n) && i < Math.pow(2, n+1)){
                angle[0] = (int) (i-Math.pow(2,n));
                angle[1] = (int) (Math.pow(2, n-1));
                    
                break;
            }
        }    
        reduce(angle);
        return angle;
    }
    
    public static int[] subtract(int i, int j){
        
        int s;
        if (i - j < 0){
            s = j-i;
        }
        else{
            s = i-j;
        }
        int[] angle = toAngle(s);
        return angle; 
    }

    public static void reduce(int[] angle){
        while ((angle[0]%2==0)&& (angle[1]%2==0)){
            angle[0] = angle[0]/2;
            angle[1] = angle[1]/2;
        }
    }
    
    public static void printAngle(int[] angle){
          System.out.println(angle[0]+"π/"+angle[1]);
    }
    
    public static void Transform(int i, int j){
        System.out.println("Angle before Reduction for n="+i);
        printAngle(toAngle(i));
       // printAngle(subtract(i,j));
        while (i%2==0){
            i = i/2;
            System.out.println("run");
        }
        if (i != 1){
            System.out.println("runAtBase");
            Transform((3*i)+1, i);
        }
    }
}
