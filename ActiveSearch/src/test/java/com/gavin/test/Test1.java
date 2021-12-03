package com.gavin.test;

import com.gavin.mapper.DeptMapper;
import com.gavin.mapper.EmpMapper;
import com.gavin.pojo.Dept;
import com.gavin.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {

        private SqlSession sqlSession = null;
    private SqlSessionFactory factory = null;

        @Before
        public void Init() throws IOException {
            InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(resource);
             sqlSession = factory.openSession();

        }

        @Test
        public void Test() {

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            List<Emp> emps = mapper.findAllEmp();

            for (Emp emp :
                    emps) {
                System.out.println(emp.getEmpno()+"--"+emp.getEname()+"--"+emp.getJob()+"--"+emp.getDept().getDname()+"--"+emp.getDept().getLoc()+"--"+emp.getDept().getDeptno());
            }
            DeptMapper mapper1 = sqlSession.getMapper(DeptMapper.class);
            List<Dept> depts = mapper1.findDeptById(10);
//            System.out.println(depts);


            for (Dept dept :
                    depts) {
                System.out.println(dept.getDeptno() + "---" + dept.getEmp());
            }

        }

        @After
        public void after() {
            sqlSession.close();

        }

    }





