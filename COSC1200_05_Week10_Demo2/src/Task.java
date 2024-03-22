/* **********************************
File:       Main class definition for Tasks for a task management system
Author:     Clint MacDonald
Date:       March 2024
Purpose:    Defining the base task interface and class
************************************* */
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Queue;
import java.util.LinkedList;

interface TaskInterface {
    public void assignToUser(String user); // NOTE: no body
    public void changeStatus(Task.Status status);
    public String toString();
}

public class Task implements TaskInterface {

    //<editor-fold desc="Static Variables and Globals">
    public static Queue<Task> tasks = new LinkedList<Task>();
    public static int taskAutoID = 1;

    public static enum Status {
        PENDING,
        IN_PROGRESS,
        TESTING,
        FOR_REVIEW,
        COMPLETE,
        CLOSED,
        CANCELLED
    }

    public static enum Priority {
        LOW,
        MEDIUM,
        HIGH,
        EMERGENCY
    }
    //</editor-fold>

    //<editor-fold desc="Properties">
    private int taskID;
    private String title;
    private String details;
    private String userAssigned;
    private Status status;
    private Priority priority;
    private LocalDate dueDate;
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">

    public int getTaskID() {
        return taskID;
    }

    public String getTitle() {
        return title;
    }

    public String getUserAssigned() {
        return userAssigned;
    }

    public Status getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setTaskID() {
        this.taskID = taskAutoID++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setUserAssigned(String userAssigned) {
        this.userAssigned = userAssigned;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
//</editor-fold>

    //<editor-fold desc="Constructors">
    public Task(){
        setTaskID();
    }

    public Task(String title, String details, String userAssigned,
                Status status, Priority priority, LocalDate dueDate) {
        setTaskID();
        setTitle(title);
        setDetails(details);
        setUserAssigned(userAssigned);
        setStatus(status);
        setPriority(priority);
        setDueDate(dueDate);
    }
    //</editor-fold>

    //<editor-fold desc="Instance methods">
    public void changeStatus (Status newStatus) {
        switch (newStatus) {
            case CANCELLED, CLOSED, PENDING, COMPLETE:
                setUserAssigned("");
                break;
        }
        setStatus(newStatus);
    }

    public void assignToUser(String userTobeAssigned) {
        if (userTobeAssigned != null) setUserAssigned(userTobeAssigned);
    }

    public void taskProgression(Status status, String userToBeAssigned) {
        assignToUser(userToBeAssigned);
        changeStatus(status);
    }

    public String toString () {
        return String.format("""
                TaskID:     %d
                User:       %s
                Title:      %s
                Details:    %s
                Priority:   %s
                Status:     %s
                Due Date:   %s
                """, taskID, userAssigned, title, details,
                priority, status, dueDate.toString());
    }

    public void addToQueue() {
        tasks.offer(this);
    }
    //</editor-fold>
}
