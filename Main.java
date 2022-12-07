package com.observ;

import com.observ.Classes.Employer;
import com.observ.Classes.Firm;

public class Main {
    public static void main(String[] args) {

        Firm firm = new Firm();
        Employer a = new Employer("Александр Мазепов");
        Employer b = new Employer("Даниил Булгаков");
        Employer c = new Employer("Доктор Дью");

        firm.registerObserver(a);
        firm.notifyObservers();

        firm.AddEmployer(a);
        firm.AddEmployer(b);
        firm.registerObserver(a);
        firm.registerObserver(c);
        firm.notifyObservers();

        firm.RemoveEmployer(a);
        firm.registerObserver(b);
        firm.notifyObservers();
    }
}