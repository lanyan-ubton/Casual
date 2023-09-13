/*求成绩平均数 */
import java.util.Scanner;

public class AverageList {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double ave,sum=0,score,i=0;
        while(true)
        {
            score=sc.nextDouble();
            if(score==-1)
                break;
            sum+=score;
            i++;
        }
        ave=sum/i;
        System.out.println(ave);
        sc.close();
    }
}

