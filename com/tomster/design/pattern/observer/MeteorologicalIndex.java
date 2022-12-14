package com.tomster.design.pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author meihewang
 * @date 2022/12/14  21:19
 */
@Data
public class MeteorologicalIndex implements Subject {
    private int temp;
    private int humidity;
    private int pressure;

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObserver();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObserver();
    }

    private List<Observer> observers;

    public MeteorologicalIndex() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        System.out.println("notify observer...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
