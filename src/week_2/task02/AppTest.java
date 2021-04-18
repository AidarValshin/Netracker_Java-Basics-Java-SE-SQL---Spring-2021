package week_2.task02;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков >1");
        int n = sc.nextInt();
        System.out.println("Введите количество кубиков >0");
        int k = sc.nextInt();
        Games myGame=new Game(n, k);
        System.out.println(myGame.play());
    }
}
