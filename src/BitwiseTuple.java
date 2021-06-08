/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-06-2021
    Time: 01:42 PM
    File: BitwiseTuple.java 
*/

import java.util.Scanner;

public class BitwiseTuple {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < Math.pow(2, m); i++) {
                for (int j = 0; j < Math.pow(2, m); j++) {
                    if ((i & j) == 0) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}