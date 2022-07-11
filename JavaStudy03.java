// 제로베이스 과제 03
// 놀이동산 입장권 계산 프로그램
// 작성자 : 이상현

import java.util.Scanner;
public class 과제3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("나이를 입력해 주세요. (숫자) : ");
        int age = in.nextInt();


        System.out.print("입장시간을 입력해 주세요. (숫자입력) : ");
        int time = in.nextInt();
            if (time >= 25) {
                System.out.println("입장시간을 다시 입력해 주세요.(1~24)");
                return;
            }


            System.out.print("국가유공자 여부를 입력해 주세요. (y/n) : ");
            String g = in.next();
            if (g.equals("y") || g.equals("Y") || g.equals("N") || g.equals("n")) {
            } else {
                System.out.println("국가유공자 여부를 다시 입력해 주세요.(y or n)");
                return;
            }


            System.out.print("복지 카드 여부를 입력해 주세요. (y/n) : ");
            String card = in.next();
            if (card.equals("y") || card.equals("Y") || card.equals("N") || card.equals("n")) {
            } else {
                System.out.println("복지 카드 여부를 다시 입력해 주세요.(y or n)");
                return;
            }


            if (age < 3) {
                System.out.println("입장료 : 무료");
                return;
            }else if(age <= 12 || time >=17) {
                System.out.println("입장료 : 4,000원");
            }else if(g.equals ("y") || g.equals ("Y") || card.equals ("y") || card.equals ("Y")){
                System.out.println("입장료 : 8,000원");
                return;
            }
            else {
                System.out.println("입장료 : 10,000원");
            }
            return;

    }
}
