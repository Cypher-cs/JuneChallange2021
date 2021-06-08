/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-06-2021
    Time: 01:36 PM
    File: SummerHeat.java 
*/

import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int a1 = sc.nextInt();
            int b = sc.nextInt();
            int b1 = sc.nextInt();

            int sum = (b/a) + (b1/a1);
            System.out.println(sum);
        }
        sc.close();
    }
}