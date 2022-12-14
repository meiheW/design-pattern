package com.tomster.design.pattern.chainofresponsibility;

/**
 * @author meihewang
 * @date 2022/12/14  18:28
 */
public class NamePrintHandler extends Handler<Student> {
    @Override
    public void doHandler(Student student) {
        System.out.println("print student name");
        System.out.println("name:" + student.getName());
    }
}
