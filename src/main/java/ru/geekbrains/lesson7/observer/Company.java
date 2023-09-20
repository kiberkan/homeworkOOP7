package ru.geekbrains.lesson7.observer;

public class Company {

    private String name;
    private Publisher jobAgency;
    private Vacancy vacancy;

    public Company(String name, Publisher jobAgency, Vacancy vacancy) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        Observer observer = jobAgency.sendOffer(name, vacancy.getName(), vacancy.getSalary());
        if(observer != null){
            jobAgency.removeObserver(observer);
            System.out.printf("Сотрудник на должность %s найден!\n", vacancy.getName());
        } else {
            vacancy.setSalary(vacancy.getSalary() + 10000);
        }
    }
}