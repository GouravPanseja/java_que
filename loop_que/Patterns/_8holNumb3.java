package Patterns;
import java.util.*;
public class _8holNumb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, N;
        int k = 1;

        System.out.print("Enter N: ");
        N = scanner.nextInt();

        for (i = 1; i <= N; i++) {
            // Print first part of the pattern
            for (j = i; j <= N; j++) {
                if (i == 1 || i == N || j == i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }

            // Print second part of the pattern
            k = j - 2;
            for (j = 1; j < i; j++, k--) {
                if (i == 1 || i == N || j == i - 1)
                    System.out.print(k);
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        scanner.close();

    }}