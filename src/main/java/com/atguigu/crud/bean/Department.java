package com.atguigu.crud.bean;

public class Department {
    private Integer deptId;

    private String deptName;
    
    

    public Department() {
		super();
		// TODO Auto-generated constructor stub在master分支上面修改 后 基于master拉的分支中的 随碟附送咖啡机
        //的数据库了双方就哭了
        //该文件也会发生变化
	}

	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}