package com.ci.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnlockUserDto {

	private String email;
	private String tempPassword;
	private String newPassword;
	private String rePassword;
}
