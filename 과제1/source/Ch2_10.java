import java.util.Scanner;

public class Ch2_10 {
    public static boolean inCircle(int px1, int py1, int px2, int py2, int radius1, int radius2){
        double lengthX, lengthY;

        lengthX = Math.pow(Math.abs(px1-px2), 2);
        lengthY = Math.pow(Math.abs(py1-py2), 2);

        if(radius1 + radius2 >= Math.sqrt(lengthX + lengthY))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int x1, y1, r1, x2, y2, r2;

        Scanner s  = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        x1 = s.nextInt();
        y1 = s.nextInt();
        r1 = s.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        x2 = s.nextInt();
        y2 = s.nextInt();
        r2 = s.nextInt();

        if(inCircle(x1, y1, x2, y2, r1, r2))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");

        s.close();
    }
}
