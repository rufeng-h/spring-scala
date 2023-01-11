package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.CurrentDeptEmp;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : chunf
 */
@Mapper
public interface CurrentDeptEmpMapper {
    int insert(CurrentDeptEmp record);

    int insertSelective(CurrentDeptEmp record);
}