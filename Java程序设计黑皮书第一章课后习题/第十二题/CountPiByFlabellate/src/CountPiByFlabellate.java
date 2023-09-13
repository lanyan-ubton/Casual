/* 将一个四分之一圆划分为10000个矩形，并计算其面积*/

import java.util.Scanner;

public class CountPiByFlabellate {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double r=2,h,w,n=2000000000,S=0;
        double x=r/n/2;
        w=r/n;
        for(int i=1;i<=n;i++)
        {
            h=Math.sqrt(r*r-x*x);
            x+=r/n;
            S+=h*w;
        }
        System.out.println(S);
        sc.close();
    }
}
