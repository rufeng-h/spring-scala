package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.DeptEmp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : chunf
 */
@Mapper
public interface DeptEmpMapper {
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("deptNo") String deptNo);

    int insert(DeptEmp record);

    int insertSelective(DeptEmp record);

    DeptEmp selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("deptNo") String deptNo);

    int updateByPrimaryKeySelective(DeptEmp record);

    int updateByPrimaryKey(DeptEmp record);
}