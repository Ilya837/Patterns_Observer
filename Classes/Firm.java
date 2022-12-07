package com.observ.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Firm implements Observable {
    private List<Employer> Employees = new ArrayList<>();
    private  List<FirmObserver> Observers = new ArrayList<>();

    public  Firm(){
    }

    public Firm(List<Employer> employees ){
        Employees = new ArrayList<>(employees);
    }

    public void AddEmployer(Employer emp){
        if(!Employees.contains(emp)){
            Employees.add(emp);
        }
    }

    public void RemoveEmployer(Employer emp){
        Employees.remove(emp);
        Observers.remove(emp);
    }

    public void post(String post){
        System.out.println(post);
    }

    @Override
    public void registerObserver(FirmObserver o) {
        if (Employees.contains(o)){
            Observers.add(o);
        }
    }

    @Override
    public void removeObserver(FirmObserver o) {
        Observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        Scanner scan = new Scanner(System.in);
        String news = scan.nextLine();
        for (FirmObserver o : Observers){
            o.update(this,news);
        }
    }
}
