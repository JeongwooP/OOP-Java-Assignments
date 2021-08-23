import java.util.Scanner;

public class Ch2_08 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        boolean deter1, deter2;

        Scanner s = new Scanner(System.in);

        System.out.print("두 점을 입력하시오.(x1, y1) >>");
        x1 = s.nextInt();
        y1 = s.nextInt();
        System.out.print("두 점을 입력하시오.(x2, y2) >>");
        x2 = s.nextInt();
        y2 = s.nextInt();

        deter1 = inRect(x1, y1, 100, 100, 200, 200); //if it is true, it is overlapped
        deter2 = inRect(x2, y2, 100, 100, 200, 200); //if it is true, it is overlapped

        if (deter1 || deter2)
            System.out.println("직사각형과 충돌한다.");
        else
            System.out.println("직사각형과 충돌하지 않는다.");

        s.close();
    }
}
