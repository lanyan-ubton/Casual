/*反序输出整数 */

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) throws Exception {
        long num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLong();
        while(true)
        {
            if(num%10==0)
                break;
            System.out.print(num%10);
            num/=10;
        }
        sc.close(); 
    }
}
