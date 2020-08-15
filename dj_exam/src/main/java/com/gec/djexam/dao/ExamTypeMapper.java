package com.gec.djexam.dao;

import com.gec.djexam.domain.ExamType;
import com.gec.djexam.domain.ExamTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamTypeMapper {
    int countByExample(ExamTypeExample example);

    int deleteByExample(ExamTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamType record);

    int insertSelective(ExamType record);

    List<ExamType> selectByExample(ExamTypeExample example);

    ExamType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamType record, @Param("example") ExamTypeExample example);

    int updateByExample(@Param("record") ExamType record, @Param("example") ExamTypeExample example);

    int updateByPrimaryKeySelective(ExamType record);

    int updateByPrimaryKey(ExamType record);
}