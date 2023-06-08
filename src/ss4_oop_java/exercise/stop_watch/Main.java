package ss4_oop_java.exercise.stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StopWatch stopWatch = new StopWatch();

        boolean flag = true;
        do {
            System.out.println("1. Start time" + "\n2. Stop time");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(stopWatch.start());
                    break;
                case 2:
                    System.out.println(stopWatch.stop());
                    System.out.println(stopWatch.getElapsedTime());
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
