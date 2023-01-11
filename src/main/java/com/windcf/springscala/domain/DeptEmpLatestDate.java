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
public class DeptEmpLatestDate {
    private Integer empNo;

    private LocalDate fromDate;

    private LocalDate toDate;
}