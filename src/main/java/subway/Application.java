package subway;

import subway.util.DataManager;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller(scanner);
        DataManager.initData();
        controller.run();
        // TODO: 프로그램 구현
    }
}
