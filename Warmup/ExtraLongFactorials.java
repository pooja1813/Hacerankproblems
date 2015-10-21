Problem Statement

You are given an integer N. Print the factorial of this number.

N!=N�(N-1)�(N-2)�?�3�2�1
Note: Factorials of N>20 can't be stored even in a 64-bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers but we need to write additional code in C/C++ to handle such large values.

We recommend solving this challenge using BigIntegers.

Input Format 
Input consists of a single integer N.

Constraints 
1=N=100

Output Format 
Output the factorial of N.

Sample Input

25
Sample Output

15511210043330985984000000


Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      BigInteger n=sc.nextBigInteger();
      BigInteger result=factorial(n);
      System.out.println(result);
    }
    
    public static BigInteger factorial(BigInteger n)
    {
        BigInteger result = BigInteger.ONE;
         while (!n.equals(BigInteger.ZERO)) 
         {
                result = result.multiply(n);
                n = n.subtract(BigInteger.ONE);
        }

        return result;
    }
}