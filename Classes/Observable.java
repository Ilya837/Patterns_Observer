package com.observ.Classes;

public interface Observable {
    void registerObserver(FirmObserver o);
    void removeObserver(FirmObserver o);
    void notifyObservers();
}
