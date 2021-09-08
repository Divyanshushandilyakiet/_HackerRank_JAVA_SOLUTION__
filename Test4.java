//Java Loops I
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Test4.java {
       public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            int mul=num*i;
            System.out.println(num+" x "+i+" = "+mul);
        }
    }
}
