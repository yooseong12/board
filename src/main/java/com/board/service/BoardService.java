package com.board.service;

import java.util.List;

import com.board.domain.AttachDTO;
import com.board.domain.BoardDTO;
import org.springframework.web.multipart.MultipartFile;

public interface BoardService {

	public boolean registerBoard(BoardDTO params);

	public boolean registerBoard(BoardDTO params, MultipartFile[] files);

	public BoardDTO getBoardDetail(Long idx);

	public boolean deleteBoard(Long idx);

	public List<BoardDTO> getBoardList(BoardDTO params);

	public List<AttachDTO> getAttachFileList(Long boradIdx);

}