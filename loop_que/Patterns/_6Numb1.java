package Patterns;
import java.util.*;
public class _6Numb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        for (int i =1 ; i<=r;i++){

            for(int j=i; j<=r; j++){
                System.out.print(j);
            }

            for(int k=1;k<=(i-1);k++){
                System.out.print(k);
            }
            System.out.println();


        }



    }}