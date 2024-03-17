package org.example.Logic;

import java.util.ArrayList;
import java.util.List;

public class Personal {
    private String nameCompany;
    private List<Worker> personal;

    public Personal(String nameCompany, List<Worker> personal) {
        this.nameCompany = nameCompany;
        this.personal = personal;
    }

    public Personal(String nameCompany) {
        this.nameCompany = nameCompany;
        this.personal = new ArrayList<Worker>();

    }

    public Personal(String nameCompany, Worker worker) {
        this.nameCompany = nameCompany;
        this.personal = new ArrayList<Worker>();
        addWorker(worker);
    }

    public void addWorker(Worker worker){
        this.personal.add(worker);
    }
    public Worker getWorker(int numberWorker){
        return this.personal.get(numberWorker);
    }

    public List<Worker> getPersonal(){
        return this.personal;
    }

    @Override
    public String toString() {
        StringBuilder personInfo = new StringBuilder();
        personInfo.append("Name Company - ").append(nameCompany).append("\n");
        int countWorker = 1;
        if (!personal.isEmpty()){
            for (Worker worker:
                 personal) {
                personInfo.append(countWorker).append(". ").append(worker).append("\n");
                countWorker++;
            }
        }else {
            personInfo.append("company is empty");
        }
        return personInfo.toString();
    }
}
