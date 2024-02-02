import java.util.*;

public class modifyTodolist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String Name = sc.nextLine();
        System.out.println("Hey" + "" + Name + "!");

        modifyInnerTodolist.choices();
        sc.close();

    }
}
