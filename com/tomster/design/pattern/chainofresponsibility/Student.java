package com.tomster.design.pattern.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author meihewang
 * @date 2022/12/14  18:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long sid;

    private String name;

    private String interests;

}
