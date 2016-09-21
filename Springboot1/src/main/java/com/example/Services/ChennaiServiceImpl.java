package com.example.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Chennai;
import com.example.Model.ChennaiRepo;


@Service
public class ChennaiServiceImpl implements ChennaiService {
	
	@Autowired
	ChennaiRepo chennairepo;
	@Override
	public List<String> getAllAreasChennai() {
		
		List<String> listarea = new ArrayList<String>();
		Iterable<Chennai> its;
		its = chennairepo.findAll();
		for(Chennai s : its)
		{
			listarea.add(s.getArea());
		}
		return listarea;
	}

}
