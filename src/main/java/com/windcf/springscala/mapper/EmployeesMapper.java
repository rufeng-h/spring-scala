package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.Employees;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : chunf
 */
@Mapper
public interface EmployeesMapper {
    int deleteByPrimaryKey(Integer empNo);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer empNo);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}