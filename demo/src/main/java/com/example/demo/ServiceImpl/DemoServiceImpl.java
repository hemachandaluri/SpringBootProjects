package com.example.demo.ServiceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.DemoService;

@Service 
public class DemoServiceImpl implements DemoService {
	
	public Object getData(Object obj) {
		return obj;
	}

}
