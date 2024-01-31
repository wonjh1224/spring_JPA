package com.example.demo.dto;

import java.time.LocalDateTime;


public class BoardDTO {
	//Entity : DB의 테이블 
	//DTO : 객체를 생성하는 클래스 (VO)
	
	private Long bno;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime regAt, modAt;

	public Long getBno() {
		return bno;
	}
	public void setBno(Long bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getRegAt() {
		return regAt;
	}
	public void setRegAt(LocalDateTime regAt) {
		this.regAt = regAt;
	}
	public LocalDateTime getModAt() {
		return modAt;
	}
	public void setModAt(LocalDateTime modAt) {
		this.modAt = modAt;
	}
	public BoardDTO(Long bno, String title, String writer, String content, LocalDateTime regAt, LocalDateTime modAt) {

		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regAt = regAt;
		this.modAt = modAt;
	}
	public BoardDTO() {

	}
	
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regAt="
				+ regAt + ", modAt=" + modAt + "]";
	}
	
	
	
	
	
	
}
