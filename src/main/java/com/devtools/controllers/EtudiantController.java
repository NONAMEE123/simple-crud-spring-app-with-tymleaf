package com.devtools.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devtools.entites.Etudiant;
import com.devtools.metier.EtudiantRepository;

@Controller
@RequestMapping(value="/Etudiant")
public class EtudiantController {
	
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		
		List<Etudiant> etud = etudiantRepository.findAll();
		model.addAttribute("etudiants", etud);
		return "etudiant";
	}
	
	@RequestMapping(value="/form",method = RequestMethod.GET)
	public String formEtudiant(Model model) {
		model.addAttribute("etudiant",new Etudiant());
		return "formEtudiant";
	}
	
	@RequestMapping(value="/saveEtudiant",method = RequestMethod.POST)
	public String save(@Valid Etudiant et,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "formEtudiant";
		}
		etudiantRepository.save(et);
		return "redirect:index";
	}
	
	@RequestMapping(value = "/supprimer")
	public String supprimer(long id) {
		etudiantRepository.deleteById(id);
		return "redirect:index";
		
		
	}
	
	@RequestMapping(value = "/edit")
	public String edit(long id,Model model) {
		Etudiant et = etudiantRepository.getOne(id);
		model.addAttribute("etudiant", et);
		return "editEtudiant";
		
		
	}
	
	@RequestMapping(value="/updateEtudiant",method = RequestMethod.POST)
	public String update(@Valid Etudiant et,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "editEtudiant";
		}
		etudiantRepository.save(et);
		return "redirect:index";
	}
	
	
	
} 
