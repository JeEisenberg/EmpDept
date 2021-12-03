package com.gavin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer deptno;

    private String dname;

    private String loc;

    private List<Emp> emp;


}