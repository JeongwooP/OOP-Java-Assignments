import java.util.Scanner;

public class Ch3_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money, count;

        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10 ,1};

        System.out.print("금액을 입력하시오>>");
        money = s.nextInt();

        for(int i = 0 ; i < unit.length ; i++){

            count = money / unit[i];

            if(count != 0)
                System.out.println(unit[i] + "원 짜리 : " + count + "개");

            money =money % unit[i];
        }

        s.close();
    }
}
