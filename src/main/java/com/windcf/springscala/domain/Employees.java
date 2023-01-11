package com.windcf.springscala.domain;

import java.time.LocalDate;
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
public class Employees {
    private Integer empNo;

    private LocalDate birthDate;

    private String firstName;

    private String lastName;

    private Object gender;

    private LocalDate hireDate;
}