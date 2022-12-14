package com.tomster.design.pattern.chainofresponsibility;

import java.util.Arrays;

/**
 * @author meihewang
 * @date 2022/12/14  18:30
 */
public class InterestAnalysisHandler extends Handler<Student> {
    @Override
    public void doHandler(Student student) {
        String[] interestArr = student.getInterests().split(",");
        System.out.println("student interests analysis");
        System.out.println(Arrays.toString(interestArr));
    }
}
