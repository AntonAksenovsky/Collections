import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList();
        while (true) {
            switch (in.nextInt()) {
                case 1:
                    System.out.println("empty = " + list.isEmpty(   ));
                    break;
                case 2:
                    System.out.println("size = " + list.size());
                    break;
                case 3:
                    System.out.println("добавить");
                    list.add(in.next());
                    break;
                case 4:
                    System.out.println("адд с индексом");
                    list.add(in.nextInt(), in.next());
                    break;
                case 5:
                    System.out.println("вернуть индекс первого вхождения элемента");
                    System.out.println(list.indexOf(in.next()));
                    break;
                case 6:
                    System.out.println("вернуть индекс посл вхождения элемента");
                    System.out.println(list.lastIndexOf(in.next()));
                    break;
                case 7:
                    System.out.println("get index");
                    Integer index = in.nextInt();
                    System.out.println(list.get(index));
                    break;
                case 8:
                    System.out.println("remove index");
                    list.remove(in.nextInt());
                    break;
                case 9:
                    System.out.println("remove obj");
                    list.remove(in.next());
                    break;
                case 10:
                    System.out.println("from-to");
                    list.subList(in.nextInt(), in.nextInt());
                    break;
                case 11:
                    System.out.println("замена index to obj");
                    list.set(in.nextInt(), in.next());
                default:
                    return;

            }
        }
    }
}
