/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-06-2021
    Time: 01:41 PM
    File: BellaCiao.java 
*/

import java.util.Scanner;

public class BellaCiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            byte a = sc.nextByte();
            byte b = sc.nextByte();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long z = a/b;
            long res = b * z * x + y * (z - 1) * z * b / 2;
            if (a % b == 0) {
                System.out.println(res);
            }
            else {
                long r = a % b;
                res = res + r*(x+z*y);
                System.out.println(res);
            }
        }
    }
}