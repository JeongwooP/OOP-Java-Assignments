import java.util.Scanner;

public class Ch3_08 {
    public static void main(String[] args) {
        int[] bag = new int[99];
        int num;

        Scanner s = new Scanner(System.in);

        System.out.print("정수 몇개?");
        num = s.nextInt();

        for(int i = 0 ; i < num ; i++) {
            bag[i] = (int) (Math.random() * 100 + 1);

            for(int l = 0; l < i; l++)
                if(bag[l] == bag[i]){
                    i--;
                    continue;
                }

        }
        for(int j = 0 ; j < num ; j++) {
            System.out.print(bag[j] + " ");

            if((j+1)%10 == 0)
                System.out.println();
        }

        s.close();
    }
}
