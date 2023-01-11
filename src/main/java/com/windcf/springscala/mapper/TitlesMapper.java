package com.windcf.springscala.mapper;

import com.windcf.springscala.domain.Titles;
import java.time.LocalDate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : chunf
 */
@Mapper
public interface TitlesMapper {
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("title") String title, @Param("fromDate") LocalDate fromDate);

    int insert(Titles record);

    int insertSelective(Titles record);

    Titles selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("title") String title, @Param("fromDate") LocalDate fromDate);

    int updateByPrimaryKeySelective(Titles record);

    int updateByPrimaryKey(Titles record);
}