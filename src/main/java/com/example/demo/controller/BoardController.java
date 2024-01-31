package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;
import com.example.demo.service.BoardSevice;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequestMapping("/board")
@Controller
public class BoardController {

	@Autowired
	private BoardSevice bsv;
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(BoardDTO bdto) {
		bsv.register(bdto);
		
		return "/index";
	}
	
	@GetMapping("/list")
	public void list(Model m) {
		List<BoardDTO> list = bsv.getList();
		m.addAttribute("list", list);
	}
	
}
