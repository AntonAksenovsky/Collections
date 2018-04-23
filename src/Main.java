import java.util.Scanner;

public class Main {
    private final ListUiHandler listUiHandler = new ListUiHandler();
    private final SetUiHandler setUiHandler = new SetUiHandler();
    private final DequeUiHandler dequeUiHandler = new DequeUiHandler();
    private final MapUiHandler mapUiHandler = new MapUiHandler();
    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().call();
    }

    private void call() {
        while (true) {
            showUi();
            getHandler().call();
        }
    }

    private void showUi() {
        System.out.println("Введите тип коллекции:");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Deque");
        System.out.println("4. Map");
    }
<<<<<<< HEAD
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            showUi();
            switch (in.nextInt()) {
                case 1:
                    new ListUiHandler().call();
                    break;
                case 2:
                    new SetUiHandler().call();
                    break;
                case 3:
                    new DequeUiHandler().call();
                    break;
                case 4:
                    new MapUiHandler().call();
                    break;
                default:
                    return;
            }
=======

    private UiHandler getHandler() {
        switch (in.nextInt()) {
            case 1:
                return listUiHandler;

            case 2:
                return setUiHandler;

            case 3:
                return dequeUiHandler;

            case 4:
                return mapUiHandler;

            default:
                return new FinalUiHandler();
>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75
        }
    }
}