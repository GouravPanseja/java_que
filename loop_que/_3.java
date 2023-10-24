//que. Count the number of digits in a number

package Java_que.loop_que;
import java.util.*;

public class _3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // int num = sc.nextInt();
        // int revNum = 0;
        // int digit=0;
        // int numCopy=num;     // A copy is made to be used for finding out digits so that the num can be used further in the code
        

        // while(numCopy>0){
        //     numCopy /=10;
        //     digit++;
        // }

        // for(int i= digit; i>0; i--){

        //     int mul =(int) Math.pow(10,i-1);            
        //     revNum += (num%10)  * mul;
        //     num /=10;
           
        // }

        // System.out.println(revNum);

        int num = sc.nextInt();
        int revNum= 0 ;


        while(num>0){

            revNum = ((revNum *10) + (num%10));
            num /=  10;
           

        }

        System.out.println(revNum);

        sc.close();
        





       
      
        
    }
}
