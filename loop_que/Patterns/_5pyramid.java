package Patterns;
import java.util.*;
public class _5pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        for(int i= 1;i<=r;i++){                 //traversing over rows

                for(int sp= 1; sp<=(r-i);sp++){     //print r-1 spaces
                }

                for(int st=1;st<=(2*i-1);st++){    // print i stars
                    System.out.print("*");
                }

                System.out.println();
            

        }

        sc.close();





    }}