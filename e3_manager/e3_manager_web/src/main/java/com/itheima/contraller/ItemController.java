package com.itheima.contraller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.pojo.TbItem;
import com.itheima.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	public ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem ItemController(@PathVariable Long itemId){
		TbItem item = itemService.findById(itemId);
//		itemService.findById(itemId);
		return item;
		
	}
}
