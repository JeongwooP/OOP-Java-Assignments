import java.util.Scanner;

public class PhoneBook {
    private Phone[] p;
    static int s = 0;

    public PhoneBook(int head){
        p = new Phone[head];
        for(int k = 0; k < p.length; k++)
            p[k] = new Phone();
    }

    public void input(String name, String tel){
        p[s].f(name, tel);
    }

    public String getName() {
        return p[s].getName();
    }

    public String getTel() {
        return p[s].getTel();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int head;
        boolean found;
        String searchName = "", name, tel;

        System.out.print("인원수>>");
        head = sc.nextInt();
        PhoneBook pb = new PhoneBook(head);
        for(int i = 0; i < head; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            name = sc.next();
            tel = sc.next();
            pb.input(name, tel);
            PhoneBook.s++;
        }
        System.out.println("저장되었습니다...");

        while(true){
            found = false;
            System.out.print("검색할 이름>>");
            searchName = sc.next();
            if(searchName.equals("그만"))
                break;
            for(PhoneBook.s = 0 ; PhoneBook.s < head; PhoneBook.s++){
                if(searchName.equals(pb.getName())) {
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println(searchName + "의 번호는 " + pb.getTel() + " 입니다.");
            }
            else
                System.out.println(searchName + " 이 없습니다.");
        }

        sc.close();
    }
}

class Phone{
    private String name;
    private String tel;

    public void f(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}