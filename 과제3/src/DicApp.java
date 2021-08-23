import java.util.Arrays;
import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String korWord, engWord;


        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            korWord = sc.nextLine();
            if(korWord.equals("그만"))
                break;
            engWord = Dictionary.kor2Eng(korWord);

            if(korWord.equals(engWord))
                System.out.println(korWord + "는 저의 사전에 없습니다.");
            else
                System.out.println(korWord + "은 " + engWord);
        }

        sc.close();
    }
}

class Dictionary{
    static int index;

    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        index = Arrays.asList(kor).indexOf(word);
        if(index != -1)
            return eng[index];
        else
            return word;
    }
}
