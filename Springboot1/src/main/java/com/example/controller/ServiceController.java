package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Carpenter;
import com.example.Model.CarpenterRepo;
import com.example.Model.Service;
import com.example.Model.ServiceRepo;

@RestController
public class ServiceController {
	
	@Autowired
	CarpenterRepo carrepo;
	@Autowired
	ServiceRepo servicerepo;
	
	
	
	@RequestMapping(value="/Carpenter", method=RequestMethod.GET)
	public ModelAndView Carpenters()
	{
		
		return new ModelAndView("Carpenter");
	}
	
	@RequestMapping(value="/MakeMeAsServiceProvider", method=RequestMethod.GET)
	public ModelAndView MakeMeAsServiceProvider(Model model)
	{
		model.addAttribute("ServiceProvider", new Carpenter());
		
		return new ModelAndView("MakeMeAsServiceProvider");
	}
	
	@RequestMapping(value="/MakeMeAsServiceProvider",produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<List<String>> findAllServices()
	{
		
		return new ResponseEntity<List<String>>(servicerepo.findAllServices(), HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/ServiceProvider", method=RequestMethod.POST)
	public ModelAndView SaveServiceProvider(@ModelAttribute("ServiceProvider") Carpenter car )
	{
		System.out.println("GETTING LATITUDE"+ car.getLatitiude());
		carrepo.save(car);
		
		return new ModelAndView("Index");
	}

}
