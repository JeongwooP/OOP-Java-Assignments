import java.util.Scanner;

public class Ch3_14 {
    public static void main(String[] args) {
        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};
        int i;


        String answer;

        Scanner s = new Scanner(System.in);

        for(;;){
            System.out.print("과목 이름>>");
            answer = s.nextLine();

            if(answer.equals("그만"))
                break;

            for(i = 0; i < course.length; i++) {
                if (answer.equals(course[i])) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
            }

            if(i == course.length)
                System.out.println("없는 과목입니다.");

        }

        s.close();


    }
}
