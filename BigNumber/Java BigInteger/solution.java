import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger x = new BigInteger(scan.next());
        BigInteger y = new BigInteger(scan.next());
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));
    }
}
