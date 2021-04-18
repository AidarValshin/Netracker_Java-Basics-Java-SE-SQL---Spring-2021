package week_2.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game implements Games {

    private static final int PERSON_IDX = 0;
    private static final int REQUIRED_WIN_COUNT = 7;

    private final int n;
    private final int k;

    private int maxRoundResult = 0;
    private final int[] roundResults;
    private final Random random;

    //значение true у победителей прошлого раунда
    boolean[] previousResults;

    public Game(int n, int k) {
        if (n < 2) {
            throw new IllegalArgumentException("Количество игроков должно быть >2 (вы и компьютер)");
        }
        if (k < 1) {
            throw new IllegalArgumentException("Количество кубиков должно быть >0");
        }
        this.n = n;
        this.k = k;
        roundResults = new int[n];
        random = new Random();
        previousResults = new boolean[n];
        previousResults[PERSON_IDX] = true;
    }

    // Непонятное условие. Сделал свой ход отличным. Чем остальные от компьютера отличаются,я не понял.

    /**
     * Главный метод. Запускает игру
     */
    @Override
    public List<String> play() {
        int[] wins = rounds();
        //Определение победителей
        return getWinners(wins);
    }

    /**
     * Определение псиска победителей
     */
    private List<String> getWinners(int[] wins) {
        List<String> winnersList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (wins[i] == REQUIRED_WIN_COUNT) {
                if (i == PERSON_IDX) {
                    winnersList.add("Вы");
                } else if (i == n - 1) {
                    winnersList.add("Компьютер");
                } else
                    winnersList.add("Игорк №: " + i);
            }
        }
        return winnersList;
    }

    /**
     * Прогон всех раундов
     */
    private int[] rounds() {
        int[] wins = new int[n];
        int currentWinCount = 0;
        System.out.println("Старт! Первым ходите Вы.");
        int round = 1;
        // Раунды до победы
        while (currentWinCount < REQUIRED_WIN_COUNT) {
            System.out.println("Раунд №" + round);
            //Сначала победители, потом остальные. в 1 раунде Вы как победитель
            round(true);
            round(false);
            for (int i = 0; i < n; i++) {
                if (roundResults[i] == maxRoundResult) {
                    previousResults[i] = true;
                    wins[i]++;
                    if(wins[i]>currentWinCount){
                        currentWinCount++;
                    }
                } else {
                    previousResults[i] = false;
                }
            }
            maxRoundResult = 0;
            round++;
        }
        return wins;
    }

    /**
     * Бросок К кубиков
     */
    private int step() {
        int result = 0;
        //Бросок К кубиков
        for (int i = 0; i < k; i++) {
            //Бросок кубика
            result += random.nextInt(5) + 1;
        }
        System.out.println("Результат: " + result + "\n");
        return result;
    }


    /**
     * Раунд игры
     *
     * @param flag true делает ход поебедителей, false ход проигвших в прошлом раунде
     */
    private void round(boolean flag) {
        for (int i = 0; i < n; i++) {
            if (previousResults[i] == flag) {
                if (i == 0) {
                    System.out.println(" Ваш ход ");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите любой символ чтобы сделать ход и нажмите Enter: ");
                    sc.next();
                    roundResults[i] = step();
                } else if (i == n - 1) {
                    System.out.println("Ход  компьютера ");
                    roundResults[i] = step();
                } else {
                    System.out.println("Ход игрока № " + i);
                    roundResults[i] = step();
                }
                if (roundResults[i] > maxRoundResult) {
                    maxRoundResult = roundResults[i];
                }
            }
        }

    }
}
