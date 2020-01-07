package com.halo.demo.service;

import com.halo.demo.mapper.PaperMapper;
import com.halo.demo.mapper.ProjectMapper;
import com.halo.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:30.
 */

@Service
public class PaperService {

    @Autowired
    PaperMapper paperMapper;

    public List<Paper> getAllPaper() {
        PaperExample paperExample = new PaperExample();
        List<Paper> papers = paperMapper.selectByExample(paperExample);
        return papers;
    }
    public List<Paper> getPaper(Integer author) {
        PaperExample paperExample = new PaperExample();
        PaperExample.Criteria criteria2 = paperExample.createCriteria();
        criteria2.andAuthorEqualTo(author);
        List<Paper> papers = paperMapper.selectByExample(paperExample);
        return papers;
    }

    public Paper addpaper(Paper paper){
        paperMapper.insert(paper);
        return null;
    }

    public Paper getPaperByPpno(int ppno_int) {
        Paper paper = paperMapper.selectByPrimaryKey(ppno_int);
        return paper;
    }

    public void updatePaper(Paper paper) {
        if (paper.getPpno() != null) {
            PaperExample paperExample = new PaperExample();
            paperExample.createCriteria().andPpnoEqualTo(paper.getPpno());
            List<Paper> papers = paperMapper.selectByExample(paperExample);
            // 插入用户信息
            if (papers.size() != 0) {
                paperMapper.updateByExampleSelective(paper, paperExample);
            }
        }
    }

    public void delPaperByPpno ( int ppno){
        {
            paperMapper.deleteByPrimaryKey(ppno);
        }
    }
}
