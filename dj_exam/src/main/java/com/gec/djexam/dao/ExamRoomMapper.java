package com.gec.djexam.dao;

import com.gec.djexam.domain.ExamRoom;
import com.gec.djexam.domain.ExamRoomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamRoomMapper {
    int countByExample(ExamRoomExample example);

    int deleteByExample(ExamRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamRoom record);

    int insertSelective(ExamRoom record);

    List<ExamRoom> selectByExample(ExamRoomExample example);

    ExamRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamRoom record, @Param("example") ExamRoomExample example);

    int updateByExample(@Param("record") ExamRoom record, @Param("example") ExamRoomExample example);

    int updateByPrimaryKeySelective(ExamRoom record);

    int updateByPrimaryKey(ExamRoom record);
}