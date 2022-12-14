package com.tomster.design.pattern.chainofresponsibility;

/**
 * @author meihewang
 * @date 2022/12/14  18:26
 */
public class IdCheckHandler extends Handler<Student> {

    @Override
    public void doHandler(Student student) {
        System.out.println("student id check");
        System.out.println("sid:" + student.getSid());
    }
}
