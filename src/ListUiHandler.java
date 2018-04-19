import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUiHandler {
    private final List list = new ArrayList();
    static Scanner in = new Scanner(System.in);

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("List.isEmpty() == " + list.isEmpty());
                    break;
                case 2:
                    System.out.println("ВВедите элемент");
                    String item = in.next();
                    System.out.println(String.format("List_contains(%s) == %b", item, list.contains(item)));
                    break;
                case 3:
                    System.out.println("Введите элемент, который вы хотите добавить");
                    list.add(in.next());
                    break;
                case 4:
                    System.out.println("Введите номер элемента и сам элемент, который вы хотите добавить");
                    list.add(in.nextInt(), in.next());
                    break;
                case 5:
                    System.out.println("Введите элемент, который хотите удалить");
                    list.remove(in.next());
                    break;
                case 6:
                    System.out.println("Введите позицию элемента, для удаления его");
                    list.remove(in.nextInt());
                    break;
                case 7:
                    System.out.println("Список всех элементов:" + list);
                    break;
                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("1. isEmpty");
        System.out.println("2. contains");
        System.out.println("3. add");
        System.out.println("4. addByIndex");
        System.out.println("5. remove");
        System.out.println("6. removeByIndex");
        System.out.println("7. showItems");
        System.out.println("8. goToMainMenu");
    }


}
