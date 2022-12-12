package com.shop.myapp2.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private int bno;
	private String title;
	private String content;
	private String author;
	private String resDate;
	private int visited;

}
