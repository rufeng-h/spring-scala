package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.Salaries;
import java.time.LocalDate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : chunf
 */
@Mapper
public interface SalariesMapper {
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("fromDate") LocalDate fromDate);

    int insert(Salaries record);

    int insertSelective(Salaries record);

    Salaries selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("fromDate") LocalDate fromDate);

    int updateByPrimaryKeySelective(Salaries record);

    int updateByPrimaryKey(Salaries record);
}