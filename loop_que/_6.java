package Java_que.loop_que;
import java.util.*;

public class _6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ans= 1;


        for(int i =1 ; i<=b; i++){
            ans= ans *a;

        }
        if(b==0){
            System.out.println(1);
        }
        else{
           System.out.println(ans); 
        }
        




 
    }
}
