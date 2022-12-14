package com.tomster.design.pattern.observer;

/**
 * @author meihewang
 * @date 2022/12/14  22:05
 */
public class HumidityObserver implements Observer {
    Integer humidity=0;

    @Override
    public void update(MeteorologicalIndex meteorologicalIndex) {
        if (meteorologicalIndex == null) {
            System.out.println("humidity is null");
            return;
        }
        if (humidity != 0 && humidity != meteorologicalIndex.getHumidity()) {
            System.out.println("humidity changed:" + humidity + "->" + meteorologicalIndex.getHumidity());
        }
        humidity = meteorologicalIndex.getHumidity();
    }
}
