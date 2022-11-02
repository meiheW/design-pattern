package com.tomster.design.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author meihewang
 * @date 2022/11/02  21:59
 */
public class CriteriaSinger implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> ans = new ArrayList<>();
        for (Person person : persons) {
            if ("singer".equals(person.getOccupation())) {
                ans.add(person);
            }
        }
        return ans;
    }
}
