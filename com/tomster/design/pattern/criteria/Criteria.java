package com.tomster.design.pattern.criteria;

import java.util.List;

/**
 * @author meihewang
 * @date 2022/11/02  21:55
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
