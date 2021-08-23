import java.util.Scanner;

public class Ch2_12_2 {
    public static void main(String[] args) {
        int parameter_1, parameter_2, result = 0;
        String operator;

        Scanner s = new Scanner(System.in);

        System.out.print("연산>>");
        parameter_1 = s.nextInt();
        operator = s.next();
        parameter_2 = s.nextInt();

        switch (operator) {
            case "+":
                result = parameter_1 + parameter_2;
                break;
            case "-":
                result = parameter_1 - parameter_2;
                break;
            case "*":
                result = parameter_1 * parameter_2;
                break;
            case "/":
                result = parameter_1 / parameter_2;
                break;
        }
        System.out.println(parameter_1 + operator + parameter_2 + "의 계산 결과는 " + result);

        s.close();
    }
}
