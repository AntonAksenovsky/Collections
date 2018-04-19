import java.util.Scanner;

public class DequeUiHandler {
    static Scanner in = new Scanner(System.in);

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("List.isEmpty() == " );
                    break;
            }
        }
    }

    private void showMenu() {
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. contains");
        System.out.println("4. addFirst");
        System.out.println("5. addLast");
        System.out.println("6. removeFirst");
        System.out.println("7. removeLast");
        System.out.println("8. getFirst");
        System.out.println("9. getLast");
        System.out.println("10. pollFirst");
        System.out.println("11. pollLast");
        System.out.println("12. goToMainMenu");
        return;
    }
}
