import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the length of array：");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        System.out.println("Enter the char array：");
        String str[]=new String[num];
        for(int count=0;count<num;count++)
        {
            str[count]=in.next();
            System.out.println(">>>>>>"+str[count]);
        }
        in.close();
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
