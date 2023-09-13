import java.util.Scanner;

public class LengthConversion {
    public static void main(String[] args) throws Exception {
        double m,i,f;
        System.out.println("请输入米数");
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        i = 0.0254*m;
        f= 12*i;
        System.out.println(m+"米等于"+i+"英寸等于"+f+"英尺");
        sc.close();
    }
}
