import java.util.Scanner;

public class modifyInnerTodolist {
    public static void choices() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Tasks do you have today ?");
        int taskNum = sc.nextInt();
        sc.nextLine();

        String[] tasks = new String[taskNum];
        for (int i = 0; i < taskNum; i++) {
            System.out.println("Enter task" + (i + 1) + "details:");
            tasks[i] = sc.nextLine();
        }
        for (String taskDetail : tasks) {
            System.out.println("- " + taskDetail);
        }
        sc.close();
    }
}
