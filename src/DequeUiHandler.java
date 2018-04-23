import java.util.LinkedList;
<<<<<<< HEAD

import java.util.Scanner;

public class DequeUiHandler {
    private static Scanner in = new Scanner(System.in);
    private final LinkedList list = new LinkedList();
=======
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DequeUiHandler implements UiHandler{
    private final Scanner in = new Scanner(System.in);

>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75

    public void call() {
        LinkedList deque = new LinkedList();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
<<<<<<< HEAD
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
=======
                    System.out.println("Список всех элементов: " + deque);
                    break;

                case 2:
                    System.out.println("deque.isEmpty() ==" + deque.isEmpty());
                    break;

                case 3: {
                    System.out.println("ВВедите элемент");
                    String item = in.next();
                    System.out.println(String.format("Deque.contains(%s) == %b", item, deque.contains(item)));
                }
                break;

                case 4:
                    System.out.println("Введите элемент, который вы хотите добавить");
                    deque.addFirst(in.next());
                    break;

                case 5:
                    System.out.println("Введите элемент, который вы хотите добавить");
                    deque.addLast(in.next());
                    break;

                case 6:
                    removeFirst(deque);
                    break;

                case 7:
                    removeLast(deque);
                    break;

                case 8:
                    getFirst(deque);
                    break;

                case 9:
                    getLast(deque);
                    break;

                case 10:
                    Object pollFirst = deque.pollFirst();
                    System.out.println(pollFirst);
                    break;

                case 11:
                    Object poolLast = deque.pollLast();
                    System.out.println(poolLast);
                    break;

>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75
                default:
                    return;
            }
        }
    }

    private void removeFirst(LinkedList deque) {
        try {
            Object removeFirst = deque.removeFirst();
            System.out.println("deque.removeFirst() == " + removeFirst);
        } catch (NoSuchElementException e) {
            System.out.println("deque.removeFirst() == " + e);
        }
    }

    private void removeLast(LinkedList deque) {
        try {
            Object removeLast = deque.removeLast();
            System.out.println("deque.removeLast() == " + removeLast);
        } catch (NoSuchElementException e) {
            System.out.println("deque.removeLast() == " + e);
        }
    }

    private void getFirst(LinkedList deque) {
        try {
            Object getFirst = deque.getFirst();
            System.out.println("List.getFirst() == " + getFirst);
        } catch (NoSuchElementException e) {
            System.out.println("List.getFirst() == " + e);
        }
    }

    private void getLast(LinkedList deque) {
        try {
            Object getLast = deque.getLast();
            System.out.println("List.getLast() == " + getLast);
        } catch (NoSuchElementException e) {
            System.out.println("List.getLast() == " + e);
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
    }
}
