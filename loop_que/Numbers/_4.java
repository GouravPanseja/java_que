package Numbers;
import java.util.*;
public class _4{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int even =0;
        int odd =0;

        for(int i =1 ; i<=n ;i++){

            if (i%2==0){
                even +=i;
            }

            else{
                odd +=i;
            }
        }

        System.out.println(odd-even);
        sc.close();


    }
}