import java.util.HashSet;
import java.util.Scanner;

<<<<<<< HEAD
public class SetUiHandler {
    private final HashSet set = new HashSet();
    private static Scanner in = new Scanner(System.in);

    public void call() {
=======
public class SetUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    public void call() {
        HashSet set = new HashSet();
>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
<<<<<<< HEAD
                    System.out.println("Список всех элементов:" + set);
                    break;
                case 2:
                    System.out.println("Set,isEmpty() == " + set.isEmpty());
                    break;
                case 3:
                    System.out.println("ВВедите элемент");
                    String item = in.next();
                    System.out.println(String.format("List_contains(%s) == %b", item, set.contains(item)));
                    break;
=======
                    System.out.println("Список элементов коллекции: " + set);
                    break;

                case 2:
                    System.out.println("Set.isEmpty() == " + set.isEmpty());
                    break;

                case 3: {
                    System.out.println("ВВедите элемент");
                    String item = in.next();
                    System.out.println(String.format("List_contains(%s) == %b", item, set.contains(item)));
                }
                break;

>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75
                case 4:
                    System.out.println("Введите элемент, который вы хотите добавить");
                    set.add(in.next());
                    break;
<<<<<<< HEAD
                case 5:
                    System.out.println("Введите элемент, который хотите удалить");
                    set.remove(in.next());
                    break;
=======

                case 5:
                    System.out.println("Введите элемент, который вы хотите удалить");
                    set.remove(in.next());
                    break;

>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75
                default:
                    return;
            }
        }
<<<<<<< HEAD

    }

    public void showMenu() {
=======
    }

    private void showMenu() {
>>>>>>> e06e2f213c2142d986de58b287206d500b2c5a75
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. contains");
        System.out.println("4. add");
        System.out.println("5. remove");
        System.out.println("6. goToMainMenu");
        return;
    }


}
