package com.gavin.mapper;


import com.gavin.pojo.Dept;

import java.util.List;

public interface DeptMapper extends EmpMapper {
    List<Dept> findDeptById(Integer id);
}