import java.util.Scanner;

public class Ch2_06 {
    public static void main(String[] args) {
        int num, ten, unit;

        Scanner s = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        num = s.nextInt();

        ten = num / 10;
        unit = num % 10;

        if(ten == 3 || ten == 6 || ten == 9) {
            if (unit == 3 || unit == 6 || unit == 9)
                System.out.print("박수짝짝");
            else
                System.out.print("박수짝");
        }
        else
            if (unit == 3 || unit == 6 || unit == 9)
                System.out.print("박수짝");

        s.close();
    }
}
