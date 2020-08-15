package com.gec.djexam.service.impl;

import com.gec.djexam.dao.NoticeMapper;
import com.gec.djexam.domain.Notice;
import com.gec.djexam.domain.NoticeExample;
import com.gec.djexam.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    public int countByExample(NoticeExample example) {
        return noticeMapper.countByExample(example);
    }

    public int deleteByExample(NoticeExample example) {
        return noticeMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return noticeMapper.deleteByPrimaryKey(id);
    }

    public int insert(Notice record) {
        return noticeMapper.insert(record);
    }

    public int insertSelective(Notice record) {
        return noticeMapper.insertSelective(record);
    }

    public List<Notice> selectByExampleWithBLOBs(NoticeExample example) {
        return noticeMapper.selectByExampleWithBLOBs(example);
    }

    public List<Notice> selectByExample(NoticeExample example) {
        return noticeMapper.selectByExample(example);
    }

    public Notice selectByPrimaryKey(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(Notice record, NoticeExample example) {
        return noticeMapper.updateByExampleSelective(record,example);
    }

    public int updateByExampleWithBLOBs(Notice record, NoticeExample example) {
        return noticeMapper.updateByExampleWithBLOBs(record,example);
    }

    public int updateByExample(Notice record, NoticeExample example) {
        return noticeMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Notice record) {
        return noticeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(Notice record) {
        return noticeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public int updateByPrimaryKey(Notice record) {
        return noticeMapper.updateByPrimaryKey(record);
    }
}
