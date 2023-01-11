package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.DeptManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : chunf
 */
@Mapper
public interface DeptManagerMapper {
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("deptNo") String deptNo);

    int insert(DeptManager record);

    int insertSelective(DeptManager record);

    DeptManager selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("deptNo") String deptNo);

    int updateByPrimaryKeySelective(DeptManager record);

    int updateByPrimaryKey(DeptManager record);
}