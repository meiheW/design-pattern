package com.tomster.design.pattern.observer;

/**
 * @author meihewang
 * @date 2022/12/14  22:07
 */
public class PressureObserver implements Observer {

    Integer pressure=0;

    @Override
    public void update(MeteorologicalIndex meteorologicalIndex) {
        if (meteorologicalIndex == null) {
            System.out.println("pressure is null");
            return;
        }
        if (pressure != 0 && pressure != meteorologicalIndex.getPressure()) {
            System.out.println("pressure changed:" + pressure + "->" + meteorologicalIndex.getPressure());
        }
        pressure = meteorologicalIndex.getPressure();
    }
}
