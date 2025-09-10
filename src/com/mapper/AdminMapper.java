package com.mapper;

import java.util.List;

import com.entity.Admin;
//数据存储对象---直接和数据库打交道
public interface AdminMapper {
    int deleteByPrimaryKey(String id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

	Admin login(Admin record);

	List<Admin> getList(Admin record);

	int getTotal(Admin record);

	int checkRepeat(Admin record);
}