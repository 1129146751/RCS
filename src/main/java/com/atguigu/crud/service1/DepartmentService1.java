package com.atguigu.crud.service1;

import com.atguigu.crud.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService1 {
    @Autowired(required = false)
    @Qualifier("DepartmentService")
	private String ss;
	public List<Department> pointCutMethod1() {
		// TODO Auto-generated method stub
		List<Department> list = null;
		System.out.println("进入方法");
		return list;
	}

	@Override
	public String toString() {
		return "DepartmentService1{" +
				"ss='" + ss + '\'' +
				'}';
	}
}
