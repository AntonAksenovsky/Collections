import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList();
        list.add(in.next());
        list.add(in.next());
        list.add(in.next());

        list.remove(in.next());
        System.out.println(list.size());
        System.out.println(list.isEmpty());

    }
}
