import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int flag=0;
        int l=A.length();
        for(int i=0;i<=l/2;i++)
        {
            if(A.charAt(i)!=A.charAt(l-1-i))
            flag++;
        }
        if(flag==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
