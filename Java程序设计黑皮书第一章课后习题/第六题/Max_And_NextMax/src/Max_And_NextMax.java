/*输出最大值和次大值*/

import java.util.Scanner;

public class Max_And_NextMax {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number,max,nextmax,sentry;
        System.out.println("请输入哨兵值:");
        sentry = sc.nextInt();
        number = sc.nextInt();
        max=number;
        number = sc.nextInt();
        if(number>max)
        {
            nextmax = max;
            max = number;
        }
        else
        {
            nextmax = number;
        }
        while(true)
        {
            number = sc.nextInt();
            if(number == sentry)
                break;
            else if(number>max)
            {
                nextmax = max;
                max = number;
            }
            else if(number>nextmax && number<max)
            {
                nextmax = number;
            }
        }
        System.out.println(max);
        System.out.println(nextmax);
        sc.close();
    }
}