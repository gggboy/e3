package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.mapper.TbItemMapper;
import com.itheima.pojo.TbItem;
import com.itheima.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem findById(Long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
