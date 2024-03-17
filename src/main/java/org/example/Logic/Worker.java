package org.example.Logic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Worker implements Comparable<Worker>{
    protected String surname;
    protected String name;
    protected String middleName;
    protected String position;
    protected String phoneNumber;
    protected int salary;
    protected LocalDate birthDate;
    protected Tasks tasks;

    public Worker(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthDate = birthDate;
        this.tasks = new Tasks();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Tasks getTasks() {
        return this.tasks;

    }

    /**
     * Постановка задачи
     * @param task Описание задачи
     * @param dayToComplete время на выполнение задачи в днях
     */

    public void assignTask(String task, int dayToComplete) {
        this.tasks.addTask(task, dayToComplete);
    }

    public int getAge() {
        return this.birthDate == null ? -1 : (int) this.birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return "Worker " +
                "surname= " + surname +
                ", name= " + name +
                ", middleName= " + middleName +
                ", position= " + position +
                ", phoneNumber= " + phoneNumber +
                ", salary= " + salary +
                ", birthDate= " + birthDate +
                ", " + tasks;
    }

    /**
     * Сортировка по Фамилии сотрудника
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Worker o) {
        return this.surname.compareTo(o.getSurname());
    }
}

