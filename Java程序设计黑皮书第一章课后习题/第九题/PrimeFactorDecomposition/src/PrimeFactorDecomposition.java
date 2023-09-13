/*质因数分解 */

import java.util.Scanner;

public class PrimeFactorDecomposition {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long number;
        number=sc.nextLong();
        for(long i=2;i<=number;i++)
        {
            if(new PrimeFactorDecomposition().PrimeNumber(i)&&number%i==0)
            {
                if(i==number)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i+"x");
                }
                number/=i;
                i--;
                continue;
            }
        }
        sc.close();
    }
    //判断除数是否为质数
     public boolean PrimeNumber(long i){
        //如果是质数，返回true
        for(long j=2;j<(long)Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
}