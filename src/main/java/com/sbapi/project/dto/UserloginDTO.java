package com.sbapi.project.dto;

import lombok.Data;

/**
 * 회원정보조회 요청 DTO
 * @author 조남훈
 *
 */
@Data
public class UserloginDTO {
	
	private String EmailId;				//회원ID
	private String UserPassword;
	
}