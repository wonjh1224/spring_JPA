package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;

public interface BoardSevice {

	void register(BoardDTO bdto);

	// BoardDTO 객체를 DB(Entity객체 = Board)에 저장
	// Board => BoardDTO 변환
	default Board convertDtoToEntity(BoardDTO bdto) {
		Board board = new Board();
		board.setBno(bdto.getBno());
		board.setContent(bdto.getContent());
		board.setTitle(bdto.getTitle());
		board.setWriter(bdto.getWriter());

		return board;

//		   return Board.builder()
//	           .bno(bdto.getBno())
//	           .title(bdto.getTitle())
//	           .writer(bdto.getWriter())
//	           .content(bdto.getContent())
//	           .build();

	}

	List<BoardDTO> getList();

	   // DB(Entity객체 = Board)에서 가져온 
	   default BoardDTO convertEntityToDto(Board board) {
//	      return BoardDTO.builder()
//	           .bno(board.getBno())
//	           .title(board.getTitle())
//	           .writer(board.getWriter())
//	           .content(board.getContent())
//	           .regAt(board.getRegAt())
//	           .modAt(board.getModAt())
//	           .build();
		   
		   BoardDTO boardDTO = new BoardDTO();
		   boardDTO.setBno(board.getBno());
		   boardDTO.setContent(board.getContent());
		   boardDTO.setTitle(board.getTitle());
		   boardDTO.setWriter(board.getWriter());
		   return boardDTO;
	   }

}
