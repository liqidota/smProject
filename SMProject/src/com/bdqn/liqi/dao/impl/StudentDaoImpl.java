package com.bdqn.liqi.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.bdqn.liqi.entity.Student;
import com.bdqn.liqi.mapper.StudentMapper;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentMapper {

	@Override
	public void add(Student student) {
		SqlSession  sqlsession= super.getSqlSession();
		StudentMapper studentMapper = sqlsession.getMapper(StudentMapper.class);
		studentMapper.add(student);
	}


}
