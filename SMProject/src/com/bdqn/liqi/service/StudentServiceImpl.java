package com.bdqn.liqi.service;

import com.bdqn.liqi.entity.Student;
import com.bdqn.liqi.mapper.StudentMapper;

public class StudentServiceImpl implements IStudentService {
	StudentMapper studentMapper;
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public void add(Student student) {
		studentMapper.add(student);
	}

}
