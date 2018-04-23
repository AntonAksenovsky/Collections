import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    public void call() {
        Map map = new TreeMap();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Список элементов коллекции:" + map);
                    break;

                case 2:
                    System.out.println("Map.isEmpty() == " + map.isEmpty());
                    break;

                case 3: {
                    String key = in.next();
                    System.out.println(String.format("Map.get(%s) == %s", key, map.get(key)));
                }
                break;

                case 4:
                    System.out.println("Добавление элемента в коллекцию (key,value)");
                    map.put(in.next(), in.next());
                    break;

                case 5:
                    System.out.println("Удалить элемент");
                    String key = in.next();
                    System.out.println(String.format("Map.remove(%s) == %s", key, map.remove(key)));
                    break;

                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. get");
        System.out.println("4. put");
        System.out.println("5. remove");
        System.out.println("6. goToMainMenu");
        return;
    }
}
