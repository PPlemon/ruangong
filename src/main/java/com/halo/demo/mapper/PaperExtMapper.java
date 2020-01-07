package com.halo.demo.mapper;

import com.halo.demo.model.Paper;
import com.halo.demo.model.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaperExtMapper {
    List<Paper> getPapersByExample(Paper paper);
}