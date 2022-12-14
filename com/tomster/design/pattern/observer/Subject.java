package com.tomster.design.pattern.observer;

/**
 * @author meihewang
 * @date 2022/12/14  21:27
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
