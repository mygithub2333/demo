package com.gec.djexam.dao;

import com.gec.djexam.domain.ExamTime;
import com.gec.djexam.domain.ExamTimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamTimeMapper {
    int countByExample(ExamTimeExample example);

    int deleteByExample(ExamTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamTime record);

    int insertSelective(ExamTime record);

    List<ExamTime> selectByExample(ExamTimeExample example);

    ExamTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamTime record, @Param("example") ExamTimeExample example);

    int updateByExample(@Param("record") ExamTime record, @Param("example") ExamTimeExample example);

    int updateByPrimaryKeySelective(ExamTime record);

    int updateByPrimaryKey(ExamTime record);
}