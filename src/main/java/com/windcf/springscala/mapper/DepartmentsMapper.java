package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.Departments;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : chunf
 */
@Mapper
public interface DepartmentsMapper {
    int deleteByPrimaryKey(String deptNo);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(String deptNo);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}