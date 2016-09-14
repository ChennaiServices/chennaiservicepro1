package com.example.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Product;
import com.example.Model.ProductRepo;
import com.example.Model.Service;
import com.example.Model.ServiceRepo;


@RestController
public class DemoC {
	@Autowired
	ProductRepo rep;
	@Autowired
	ServiceRepo servicerepo;
	
	
	@RequestMapping(value="/xyz")
	public ModelAndView Ram()
	{
		return new ModelAndView("Home");
	}
	
	@RequestMapping(value="/")
	
		public ModelAndView getServices()
		{
			
			return new ModelAndView("Index");
		}
	
	
	@RequestMapping(value="/services", produces = "application/json", method = RequestMethod.GET)
	
	public ResponseEntity<List<Service>> getAllServices()
	{
		List<Service> listser = new ArrayList<Service>();
		Iterable<Service> its;
		its = servicerepo.findAll();
		
		for(Service s : its)
		{
			listser.add(s);
		}
		return new ResponseEntity<List<Service>>(listser, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="Home", method = RequestMethod.GET)
	
		public ModelAndView Home()
		{
		
			return new ModelAndView("Home");
		}
	
}
