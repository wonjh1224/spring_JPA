package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Table(name="") // 이름이 클래스명과 다를 때만 사용
@Entity
public class Board extends TimeBased{

	//Entity : DB의 테이블 
	//DTO : 객체를 생성하는 클래스 (VO)
	
	//자주쓰는 코드들 : base class로 별도 관리 (regAt, modAt)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Long bno;
	
	@Column(length = 100, nullable = false)
	private String title;
	
//	@ColumnDefault("writer")
	@Column(length = 100, nullable = false)
	private String writer;
	
	@Column(length = 10000, nullable = false)
	private String content;
	
	public Board(Long bno, String title, String writer, String content) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	public Board() {
		super();
	}
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
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
	
	
	
	
	
}
