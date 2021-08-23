import java.util.Scanner;

public class Ch2_04 {
    public static void main(String[] args) {
        int first, second, third, output = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");

        first = s.nextInt();
        second = s.nextInt();
        third = s.nextInt();

        if((second < first && first < third) || (third < first && first < second))
            output = first;
        else if((first < second && second < third) || (third < second && second < first))
            output = second;
        else if((first < third && third < second) || (second < third && third < first))
            output = third;

        System.out.println("중간 값은 " + output);

        s.close();
    }

}
