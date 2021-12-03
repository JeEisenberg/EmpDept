package com.gavin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private Date hiredate;

    private Integer sal;

    private Integer comm;

    private Dept dept;


}