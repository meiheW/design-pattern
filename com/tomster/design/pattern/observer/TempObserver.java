package com.tomster.design.pattern.observer;

/**
 * @author meihewang
 * @date 2022/12/14  21:22
 */
public class TempObserver implements Observer {

    /*public TempObserver(MeteorologicalIndex meteorologicalIndex) {
        meteorologicalIndex.registerObserver(this);
    }*/

    Integer temp = 0;

    @Override
    public void update(MeteorologicalIndex meteorologicalIndex) {
        if (meteorologicalIndex == null) {
            System.out.println("temp is null");
            return;
        }
        if (temp != 0 && temp != meteorologicalIndex.getTemp()) {
            System.out.println("temp changed:" + temp + "->" + meteorologicalIndex.getTemp());
        }
        temp = meteorologicalIndex.getTemp();
    }
}
