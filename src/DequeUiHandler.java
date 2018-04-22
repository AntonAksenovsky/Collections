import java.util.LinkedList;

import java.util.Scanner;

public class DequeUiHandler {
    private static Scanner in = new Scanner(System.in);
    private final LinkedList list = new LinkedList();

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Список всех элементов:" + list);
                    break;
                case 2:
                    System.out.println("List.isEmpty() == " + list.isEmpty());
                    break;
                case 3:
                    System.out.println("ВВедите элемент");
                    String item = in.next();
                    System.out.println(String.format("List_contains(%s) == %b", item, list.contains(item)));
                    break;
                case 4:
                    System.out.println("Введите элемент, который вы хотите добавить");
                    list.addFirst(in.next());
                    break;
                case 5:
                    System.out.println("Введите элемент, который вы хотите добавить");
                    list.addLast(in.next());
                    break;
                case 6:
                    if (list.isEmpty()) {
                        System.out.println("Колекция пустая");
                        break;
                    } else {
                        list.removeFirst();
                    }
                    break;
                case 7:
                    if (list.isEmpty()) {
                        System.out.println("Колекция пустая");
                        break;
                    } else {
                        list.removeLast();
                    }
                    break;
                case 8:
                    if (list.isEmpty()) {
                        System.out.println("Колекция пустая");
                        break;
                    } else {
                        list.getFirst();
                    }
                    break;
                case 9:
                    if (list.isEmpty()) {
                        System.out.println("Колекция пустая");
                        break;
                    } else {
                        list.getLast();
                    }
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    return;
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
