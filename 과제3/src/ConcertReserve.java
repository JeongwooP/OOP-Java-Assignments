import java.util.Arrays;
import java.util.Scanner;

class SetSeat{
    private String[] seats;
    private String[] rowName;

    public SetSeat(){
        seats = new String[10];

        for(int i = 0; i < seats.length; i++)
            seats[i] = "---";

        rowName = new String[3];

        rowName[0] = "S";
        rowName[1] = "A";
        rowName[2] = "B";
    }

    public void reserve(String name, int seatNum){
        try {
            seats[seatNum - 1] = name;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("좌석 지정 숫자가 범위(1~10)에 벗어납니다. 다시 시작합니다.");
        }
    }

    public void printSeats(int row){

        System.out.print(rowName[row] + ">> ");

        for(int i = 0 ; i < seats.length; i++)
            System.out.print(seats[i] + " ");

        System.out.println();
    }

    public String[] getSeats() {
        return seats;
    }
}

public class ConcertReserve {
    private static SetSeat seat[];
    private String[] rowName;

    public ConcertReserve(){
        seat = new SetSeat[3];

        for(int e = 0; e < seat.length; e++)
            seat[e] = new SetSeat();

        rowName = new String[3];
        rowName[0] = "S";
        rowName[1] = "A";
        rowName[2] = "B";
    }


    public void printEverySeats(){
        for(int e = 0; e < seat.length; e++)
            seat[e].printSeats(e);


        System.out.println("<<조회를 완료하였습니다.>>");
    }

    public boolean cancel(String name, int seatNum){
        int index;

        index = Arrays.asList(seat[seatNum].getSeats()).indexOf(name);
        if(index != -1) {
                seat[seatNum].getSeats()[index] = "---";
                System.out.println("취소됨");
                return true;
        }

        System.out.println("찾으시는 분은 예약을 안했습니다.");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seatNum;
        String name, decision, dSeat;


        System.out.println("명품콘서트홀 예약 시스템입니다.");

        ConcertReserve c = new ConcertReserve();

        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            decision = sc.next();


            if(decision.equals("1")){
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                dSeat = sc.next();

                if(dSeat.equals("1")){
                    seat[0].printSeats(0);
                }
                else if(dSeat.equals("2")){
                    seat[1].printSeats(1);
                }
                else if(dSeat.equals("3")){
                    seat[2].printSeats(2);
                }
                else{
                    System.out.println("잘못된 좌석구분 입니다. 다시 합니다.");
                    continue;
                }

                System.out.print("이름>>");
                name = sc.next();
                System.out.print("번호>>");
                seatNum = sc.nextInt();

                seat[Integer.parseInt(dSeat) - 1].reserve(name, seatNum);
            }
            else if(decision.equals("2")){
                c.printEverySeats();
            }
            else if(decision.equals("3")){
                System.out.print("좌석 S:1, A:2, B:3>>");
                dSeat = sc.next();

                if(dSeat.equals("1")){
                    seat[0].printSeats(0);
                }
                else if(dSeat.equals("2")){
                    seat[1].printSeats(1);
                }
                else if(dSeat.equals("3")){
                    seat[2].printSeats(2);
                }
                else{
                    System.out.println("잘못된 좌석구분 입니다. 다시 합니다.");
                    continue;
                }

                System.out.print("이름>>");
                name = sc.next();
                if(!c.cancel(name, Integer.parseInt(dSeat) - 1))
                    continue;
            }
            else if(decision.equals("4")){
                break;
            }
            else{
                System.out.println("오류 선택입니다. 다시 합니다.");
                continue;
            }
        }

        sc.close();

    }
}

