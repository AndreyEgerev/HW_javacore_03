package org.example;

import org.example.Logic.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Random;

/*
Егерев Андрей
группа Веб разработка на Java
1. Написать компоратор по фамилии
2. Опишите класс руководителя (Manager), наследник от сотрудника. Перенесите статический метод повышения зарплаты
в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
3. Добавить возможность сотрудникам брать на себя задачу (реализовать либо как String, либо как объект класса Task)
- например, метод assign(Task task). У руководителя должна быть возможность ставить задачу сотруднику,
используя перегрузку метода assign(...) и брать задачу себе.
 */
public class Main {
    public static void main(String[] args) {

        Personal personal = addTestList();
        System.out.println(personal);

        //1
        System.out.println("1 Сортировка по фамилии");
        Collections.sort(personal.getPersonal());
        System.out.println(personal);

        //2

        System.out.println("2 Повышение зарплаты");
        Chief.addSalary(personal,100);
        System.out.println(personal);

        //3
        System.out.println("3 Постановка задач сотрудникам");
        Random random = new Random();
        int numberWorker = random.nextInt(personal.getPersonal().size());
        Chief td = null;
        for (Worker worker:
             personal.getPersonal()) {
            if (worker instanceof Chief){
                td = (Chief) worker;
                break;
            }
        }
        if (td != null) {
            td.assignTask("work", 1, personal.getWorker(numberWorker));
        }
        System.out.println(personal);

    }

    public static Personal addTestList(){
        Personal personal = new Personal("Test Company");
        personal.addWorker(new Worker("Ivanov", "Ivan", "Ivanovich",
                "backend-developer", "+7-999-888-77-66", 100,
                LocalDate.of(1990, 10, 17)));
        personal.addWorker(new Worker("Petrov", "Petr", "Fedorovich",
                "backend-developer", "+7-999-888-77-65", 100,
                LocalDate.of(1991, 1, 23)));
        personal.addWorker(new Worker("Sidorov", "Semen", "Petrovich",
                "backend-developer", "+7-999-888-77-67", 100,
                LocalDate.of(1995, 5, 10)));
        personal.addWorker(new Chief("Popov", "Andrey", "Victorovich",
                "team-lead", "+7-999-777-77-77", 300,
                LocalDate.of(1983, 8, 17)));
        return personal;
    }


}