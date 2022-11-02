package com.tomster.design.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author meihewang
 * @date 2022/11/02  21:59
 */
public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> ans = new ArrayList<>();
        for (Person person : persons) {
            if ("male".equals(person.getGender())) {
                ans.add(person);
            }
        }
        return ans;
    }
}
