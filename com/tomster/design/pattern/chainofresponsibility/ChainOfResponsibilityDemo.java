package com.tomster.design.pattern.chainofresponsibility;

/**
 * @author meihewang
 * @date 2022/12/14  17:50
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.setSid(1L);
        student.setName("tomster");
        student.setInterests("music,reading,coding");

        Handler.Builder<Student> builder = new Handler.Builder<>();
        Handler<Student> handlerChain = builder.addHandler(new IdCheckHandler())
                .addHandler(new NamePrintHandler())
                .addHandler(new InterestAnalysisHandler())
                .build();

        handlerChain.process(student);
    }

}
