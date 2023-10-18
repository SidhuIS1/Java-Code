import java.util.ArrayList;
import java.util.Scanner;
public class TodoListApp{
    private ArrayList<String>todoList = new ArrayList<>();

public void displayList(){
    if(todoList.size() == 0){
        System.out.println("List is empty");
    }
    else{
        System.out.println("To Do List:");

        for(int i=0;i<todoList.size();i++){
            System.out.println((i + 1) + " " + todoList.get(i));
        }
    }
}
public void addTask(String task){
    todoList.add(task);
    System.out.println("Task added");
}
public void removeTask(int taskIndex){
        if(taskIndex<0 || taskIndex > todoList.size()){
        System.out.println("The task no. mentioned is not present");
    }
    else{
        String removedTask = todoList.remove(taskIndex);
        System.out.println("Task removed : " + removedTask);
         
    }  
}
 public static void main(String[] args){
        TodoListApp todoApp = new TodoListApp();
        Scanner sc = new Scanner(System.in);
        int ch;
    do{
         System.out.println("1.Display\n2.Add\n3.Remove\n4.Quit\n");
    System.out.println("Enter the choice:");
    ch = sc.nextInt();
    sc.nextLine();
    switch(ch){
        case 1 : todoApp.displayList();
                break;
        case 2 : System.out.println("Enter the task :");
                String taskAdd = sc.nextLine();
                todoApp.addTask(taskAdd);
                break;
        case 3 : System.out.println("Enter the task number to be removed");
                int taskIndex = sc.nextInt();
                sc.nextLine();
                todoApp.removeTask(taskIndex - 1);
                break;
        case 4 : System.out.println("Have a nice day");
                break;
        default :System.out.println("Invalid choice");

    }
    }while(ch !=4);
    sc.close();
    }
}

