package org.example.Logic;

import java.time.LocalDate;

public class Task {
    private String task;
    private LocalDate startDate;
    private int daysToComplete;

    public Task(String taskDescription, int daysToComplete) {
        this.task = taskDescription;
        this.daysToComplete = daysToComplete;
        this.startDate = LocalDate.now();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

//    public int getDaysToComplete() {
//        return daysToComplete;
//    }

    public void setDaysToComplete(int daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public LocalDate getDateComplete(){
        return startDate.plusDays(daysToComplete);
    }

    public boolean missedTask(){
         return LocalDate.now().isBefore(getDateComplete());
    }

    @Override
    public String toString() {
        StringBuilder taskInfo = new StringBuilder("Task : ");
        if (this.task.equals("Empty")){
            taskInfo.append(task).append(", start date - ").append(startDate.toString());
        }else {
            taskInfo.append(task).append(", start date - ").append(startDate.toString()).append(", completion date - ").append(getDateComplete().toString());
        }
        return taskInfo.toString();
    }
}
