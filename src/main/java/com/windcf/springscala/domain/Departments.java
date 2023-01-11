package com.windcf.springscala.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : chunf
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Departments {
    private String deptNo;

    private String deptName;
}