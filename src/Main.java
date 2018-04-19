import java.util.Scanner;

public class Main {
    public static void showUi() {
        System.out.println("Введите тип коллекции:");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Deque");
        System.out.println("4. Map");
    }
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            showUi();
            switch (in.nextInt()) {
                case 1:
                    new ListUiHandler().call();
                    break;
                case 2:
                    new DequeUiHandler().call();
                    break;
                case 3:
                    new SetUiHandler().call();
                    break;
                case 4:
                    new MapUiHandler().call();
                    break;
                default:
                    return;
            }
        }
    }
}