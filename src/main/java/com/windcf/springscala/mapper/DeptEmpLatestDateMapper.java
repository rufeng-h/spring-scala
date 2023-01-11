package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.DeptEmpLatestDate;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : chunf
 */
@Mapper
public interface DeptEmpLatestDateMapper {
    int insert(DeptEmpLatestDate record);

    int insertSelective(DeptEmpLatestDate record);
}