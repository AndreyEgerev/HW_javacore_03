package org.example.Logic;

import java.time.LocalDate;

public class Chief extends Worker{
    public Chief(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }

    /**
     * Добавление задачи сотрудникам
     * @param task описание задачи
     * @param dayToComplete время на выполнение задачи в днях
     * @param worker работник, которому ставится задача
     */
    public void assignTask(String task, int dayToComplete, Worker worker) {
        worker.assignTask(task,dayToComplete);
    }

    @Override
    public void assignTask(String task, int dayToComplete) {
        super.assignTask(task, dayToComplete);
    }

    /**
     * Увеличение зарплаты базовым сотрудникам. Зарплата руководящего состава не увеличивается
     * @param workers перечень персонала
     * @param addAmount на сколько увеличивается зарплата
     */
    public static void addSalary(Personal workers, int addAmount) {
        for (Worker worker : workers.getPersonal()) {
            if (!(worker instanceof Chief)){
                worker.setSalary(worker.getSalary() + addAmount);
            }
        }
    }

    @Override
    public String toString() {
        return "Chief "+
                "surname= " + surname +
                ", name= " + name +
                ", middleName= " + middleName +
                ", position= " + position +
                ", phoneNumber= " + phoneNumber +
                ", salary= " + salary +
                ", birthDate= " + birthDate +
                ", " + tasks;
    }
}
