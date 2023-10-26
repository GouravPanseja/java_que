package Patterns;
import java.util.*;
public class _9Numb4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();


        for(int i=1; i<=r; i++){

            for(int j=1; j<=c;j++){

                if((i+j) % 2 ==0){    // bracket on (i+j) is necessary because % has higher precedence than +
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }

    }}
