import java.util.Scanner;

public class Ch3_10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Scanner s = new Scanner(System.in);


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = (int)(Math.random() * 10 + 1);
        }

        for(int e = 0; e < 4; e++){
            int a = (int)(Math.random() * 3);
            int b = (int)(Math.random() * 3);

            if(array[a][b] == 0)
                e--;
            else
                array[a][b] = 0;
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");

            System.out.println();
        }

        s.close();


    }

}
