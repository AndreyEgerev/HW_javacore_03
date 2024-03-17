package org.example.Logic;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    List<Task> tasks;

    public Tasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Tasks(Task task) {
        this.tasks = new ArrayList<Task>();
        this.tasks.add(task);
    }

    public Tasks(String task, int dayToComplete) {
        this(new Task(task,dayToComplete));
    }

    public Tasks() {
        this("Empty",0);
    }

    public void addTask(String task, int dayToComplete){
        if (tasks.size() == 1 && tasks.get(0).getTask().equals("Empty")) {
            this.tasks.remove(0);
            this.tasks.add(new Task(task, dayToComplete));
        }else {
            this.tasks.add(new Task(task, dayToComplete));
        }
    }
    public void removeTask(int numberTask){

    }

    @Override
    public String toString() {
        StringBuilder infoTasks = new StringBuilder();
        for (Task task:
             this.tasks) {
            infoTasks.append(task).append("; ");
        }
        //return tasks.toString();
        return infoTasks.toString();
    }
}
