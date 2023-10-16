package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@Service // spring bean
public class StoreBO {
	
	@Autowired
	public StoreMapper storeMapper;
	
	// input(컨트롤러 요청) : X
	// output(컨트롤러에게 응답) : List<Store>
	public List<Store> getStoreList() {
		return storeMapper.selectStoreList();
	}
}
