package com.shop.myapp2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDTO {
	private String id;
    private String email;
    private String password;
    private String createdDate;
    private String modifiedDate; 
}
