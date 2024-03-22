/* **********************************
File:       Main Application to Demo Queues, Interfaces, and Enums
Author:     Clint MacDonald
Date:       March 2024
Purpose:    To learn Queues, Interfaces, and Enums
************************************* */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task();
        task1.setTitle("Task Number 1");
        task1.setDetails("Some things to do here when we have time!");
        task1.setStatus(Task.Status.PENDING);
        task1.setPriority(Task.Priority.HIGH);
        task1.setDueDate(LocalDate.now().plusDays(7));

        System.out.println("Task1");
        System.out.print(task1.toString());
    }
}