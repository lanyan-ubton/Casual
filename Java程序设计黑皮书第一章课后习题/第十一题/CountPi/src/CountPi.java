/*计算由莱布尼茨序列前10000项构成的Pi的近似值 */

import java.util.Scanner;

public class CountPi {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double pi=0,num=1;
        for(int i=1;i<10000;i++)
        {
            if(i%2==0)    
                pi+=-4*(1/num);
            else
                pi+=4*(1/num);
            num+=2;
        }
        System.out.println(pi);
        sc.close();
    }
}
