package com.observ.Classes;

public class Employer implements FirmObserver {
    private String Name;

    public Employer(String name){
        Name = name;
    }

    @Override
    public void update(Firm f,String news) {
        f.post(Name +" получил новость, что " + news);
    }
}
