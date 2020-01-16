package com.p6spy.demo.mapper;

import com.p6spy.demo.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TestMapper {

    List<Test> selectTest(@Param("id") int id);
}
