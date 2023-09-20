package ru.geekbrains.lesson7.observer;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();

        Vacancy vacancy1 = new Vacancy("Дизайнер",80000);
        Vacancy vacancy2 = new Vacancy("Системный администратор",40000);
        Vacancy vacancy3 = new Vacancy("Разработчик", 120000);
        Vacancy vacancy4 = new Vacancy("Уборщик помещения", 25000);

        Company google = new Company("Google",  jobAgency, vacancy1);
        Company yandex = new Company("Yandex",  jobAgency, vacancy2);
        Company geekBrains = new Company("GeekBrains",  jobAgency, vacancy3);
        Company itProger = new Company("ItProger",  jobAgency, vacancy4);

        Student student1 = new Student("Дмитрий","Дизайнер");
        Worker worker1 = new Worker("Антон","Системный администратор");
        Freelancer freelancer1 = new Freelancer("Николай","Разработчик");
        Freelancer freelancer2 = new Freelancer("Артем","Уборщик помещения");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(freelancer1);
        jobAgency.registerObserver(freelancer2);

        for (int i = 0; i < 4; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            itProger.needEmployee();
        }
    }
}

