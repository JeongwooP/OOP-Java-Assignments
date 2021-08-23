import java.util.Scanner;

public class Ch2_02 {
    public static void main(String[] args) {
        int num, tens, units;

        Scanner s = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");

        num = s.nextInt();

        tens = num / 10;
        units = num % 10;

        if(tens == units)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");

        s.close();
    }
}
