package edu.uestc.lib.MSStudio.collecting.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.uestc.lib.MSStudio.collecting.dao.GroupSchoolMapper;
import edu.uestc.lib.MSStudio.collecting.model.GroupSchool;
import edu.uestc.lib.MSStudio.collecting.service.GroupSchoolService;

@Service("groupSchoolService")
public class GroupSchoolServiceImpl implements GroupSchoolService{

	@Resource
	private GroupSchoolMapper dao;
	
	@Override
	public boolean deleteObjectByID(String id) {
		// TODO Auto-generated method stub
		if (dao.deleteByPrimaryKey(Integer.valueOf(id))!=0) return true;
		return false;
	}

	@Override
	public boolean checkObjectByID(String id) {
		if (dao.checkByID(1,Integer.valueOf(id))!=0) return true;
		else return false;
	}

	@Override
	public GroupSchool getGroupSchool(String id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public boolean save(GroupSchool record) {
		if (dao.insert(record)!=0) return true;
		return false;
	}

	@Override
	public List<GroupSchool> listAllGroupSchool(String num, String size) {
		int pageNum = Integer.valueOf(num);
		int pageSize = Integer.valueOf(size);
		//System.out.println((pageNum-1)*pageSize+" "+pageNum*pageSize);
		return dao.getAllObject((pageNum-1)*pageSize,pageSize);
	}

	@Override
	public boolean update(GroupSchool record) {
		if (dao.updateByPrimaryKeySelective(record)!=0) return true;
		return false;
	}

}
