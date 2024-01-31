package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardSeviceImpl implements BoardSevice{
	
	@Autowired
	private BoardRepository repository;

	@Override
	public void register(BoardDTO bdto) {
		
		Board board = convertDtoToEntity(bdto);
		
		repository.save(board);
		
	}

	@Override
	public List<BoardDTO> getList() {
		//DB에서 list로 리턴이 되기 때문에 Board list로 리턴 => DTO 객체로 변환
		List<Board> list = repository.findAll(Sort.by(Sort.Direction.DESC, "bno"));
		List<BoardDTO> dtoList = new ArrayList<>();
		for(Board board : list) {
			dtoList.add(convertEntityToDto(board));
		}
		return dtoList;
	}

	
}
