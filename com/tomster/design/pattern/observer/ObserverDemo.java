package com.tomster.design.pattern.observer;

/**
 * @author meihewang
 * @date 2022/12/14  21:17
 */
public class ObserverDemo {

    public static void main(String[] args) {
        MeteorologicalIndex meteorologicalIndex = new MeteorologicalIndex();
        meteorologicalIndex.registerObserver(new TempObserver());
        meteorologicalIndex.registerObserver(new HumidityObserver());
        meteorologicalIndex.registerObserver(new PressureObserver());
        //init...
        meteorologicalIndex.setTemp(25);//20-30
        meteorologicalIndex.setHumidity(2);//1-10
        meteorologicalIndex.setPressure(101);//100-
        //temp change...
        meteorologicalIndex.setTemp(30);
        meteorologicalIndex.setTemp(35);
        meteorologicalIndex.setTemp(40);
        //humidity change...
        meteorologicalIndex.setHumidity(4);
        meteorologicalIndex.setHumidity(6);
        meteorologicalIndex.setHumidity(8);
        //humidity change...
        meteorologicalIndex.setPressure(103);
        meteorologicalIndex.setPressure(105);
        meteorologicalIndex.setPressure(107);
    }

}
