import java.util.HashSet;
import java.util.Set;

public class SetUiHandler {
    public void call() {
        System.out.println("1. isEmpty");
        System.out.println("2. contains");
        System.out.println("3. add");
        System.out.println("4. addByIndex");
        System.out.println("5. remove");
        System.out.println("6. removeByIndex");
        System.out.println("7. showItems");
        System.out.println("8. goToMainMenu");
        return;
    }
    private final HashSet set = new HashSet();

}
