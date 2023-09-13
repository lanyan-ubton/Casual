/*将摄氏度转化为华氏度 */
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) throws Exception {
        double celsius=0.0;
        System.out.println("请输入摄氏度");
        Scanner sc=new Scanner(System.in);
        celsius=sc.nextDouble();
        double fahrenheit=9.0/5.0*celsius+32;
        System.out.println("转化为华氏度为:"+fahrenheit);
        sc.close();
    }
}

