package com.tomster.design.pattern.criteria;

import java.util.List;

/**
 * @author meihewang
 * @date 2022/11/02  22:20
 */
public class AndCriteria implements Criteria {

    private Criteria criteriaA;
    private Criteria criteriaB;

    public AndCriteria(Criteria criteriaA, Criteria criteriaB) {
        this.criteriaA = criteriaA;
        this.criteriaB = criteriaB;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return criteriaB.meetCriteria(criteriaA.meetCriteria(persons));
    }
}
