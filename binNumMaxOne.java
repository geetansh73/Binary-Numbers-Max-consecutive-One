import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
        String str=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
        if (str.charAt(i)=='1')
        {
        count++;
        }
        else
        {
        break;
        }
        }
        System.out.println(count);
        }
}
