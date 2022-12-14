package com.tomster.design.pattern.build;

import java.util.Arrays;

/**
 * @author meihewang
 * @date 2022/12/14  20:35
 */
public class BuildDemo {

    public static void main(String[] args) {
        ClassInfo.Builder builder = ClassInfo.newBuilder();
        ClassInfo classInfo = builder.setClassName("class id: 0")
                .setStudents(Arrays.asList(new Student(1, "tomster"), new Student(2, "cindy")))
                .setTeachers(Arrays.asList(new Teacher(1, "t1"), new Teacher(2, "t2")))
                .build();
        System.out.println(classInfo);
    }
}
