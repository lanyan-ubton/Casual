/*数学游戏：若为偶数则除二，若为奇数则乘三再加一 */
import java.util.Scanner;

public class MathGames {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        while(true)
        {
            if(num==1)
                break;
            if(num%2==0)
            {
                System.out.println(num+" is even,so I divide it by 2 to get "+(num/2));
                num/=2;
            }
            else
            {
                System.out.println(num+" is odd,so I multiply by 3 and add 1 to get "+(num*3+1));
                num=num*3+1;
            }
        }
        sc.close();
    }
}
