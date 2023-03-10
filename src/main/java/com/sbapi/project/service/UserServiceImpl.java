package com.sbapi.project.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbapi.project.dao.UserDAO;
import com.sbapi.project.response.ApiException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDAO dao;

	/* 회원등록여부조회 */
	@Override
	public String selectUserRegYn(Map<String, Object> params) throws ApiException {
		return dao.selectUserRegYn(params);
	}
	
	/* 회원정보조회 */
	@Override
	public Map<String, Object> selectUserInfo(Map<String, Object> params) throws ApiException {
		
		
		
		return dao.selectUserInfo(params);
	}
	
	/* 회원등록여부조회 */
	@Override
	public int insertuserInfo(Map<String, Object> params) throws ApiException {
		return dao.insertuserInfo(params);
	}
	
}
