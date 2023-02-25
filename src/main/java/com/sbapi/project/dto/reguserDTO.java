package com.sbapi.project.dto;

import lombok.Data;

/**
 * 회원정보조회 요청 DTO
 * @author 조남훈
 *
 */
@Data
public class reguserDTO {
	
	private String reguserID;				//회원ID
	private String regUserPassword;
	
}