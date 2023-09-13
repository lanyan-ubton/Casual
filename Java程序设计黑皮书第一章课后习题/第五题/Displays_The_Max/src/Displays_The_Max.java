/*读入一组整数直至读入哨兵值，输出除哨兵值以外的最大值 */

import java.util.Scanner;

public class Displays_The_Max {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max,m=1,sentry;
        System.out.println("请输入哨兵值：");
        sentry = sc.nextInt();
        m = sc.nextInt();
        max=m;
        while(true)
        {
            m = sc.nextInt();
            if(m==sentry)
                break;
            if(m>max)
                max=m;
        }
        System.out.println(max);
        sc.close();
    }
}
