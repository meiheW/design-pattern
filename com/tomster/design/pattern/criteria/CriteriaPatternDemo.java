package com.tomster.design.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author meihewang
 * @date 2022/11/02  22:06
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("jay chou", "male", "singer"));
        persons.add(new Person("taylor swift", "female", "singer"));
        persons.add(new Person("jack ma", "male", "teacher"));
        persons.add(new Person("jennifer aniston", "female", "actor"));
        persons.add(new Person("stephen chou", "male", "actor"));
        persons.add(new Person("lebron james", "male", "athlete"));
        persons.add(new Person("usain bolt", "male", "athlete"));

        //输出男性
        List<Person> male = new CriteriaMale().meetCriteria(persons);
        System.out.println(male);
        //输出歌手
        List<Person> singer = new CriteriaSinger().meetCriteria(persons);
        System.out.println(singer);
        //输出男歌手
        AndCriteria maleSingleCriteria = new AndCriteria(new CriteriaMale(), new CriteriaSinger());
        List<Person> maleSingle = maleSingleCriteria.meetCriteria(persons);
        System.out.println(maleSingle);
    }

}
