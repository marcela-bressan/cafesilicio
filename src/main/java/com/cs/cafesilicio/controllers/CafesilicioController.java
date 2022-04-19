package com.cs.cafesilicio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cs.cafesilicio.models.Mensagem;
import com.cs.cafesilicio.repositories.MensagemRepository;


@Controller
public class CafesilicioController {
	
	@Autowired
	private MensagemRepository mir;


	@RequestMapping(value ="/inicio", method=RequestMethod.GET)
	public ModelAndView getInicial() {
		ModelAndView mav = new ModelAndView("/site/inicio/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	@RequestMapping(value ="/contato", method=RequestMethod.GET)
	public ModelAndView getContato() {
		ModelAndView mav = new ModelAndView("/site/contato/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	@RequestMapping(value ="/recursos", method=RequestMethod.GET)
	public ModelAndView getRecursos() {
		ModelAndView mav = new ModelAndView("/site/recursos/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	
	@RequestMapping(value ="/noticias", method=RequestMethod.GET)
	public ModelAndView getNoticias() {
		ModelAndView mav = new ModelAndView("/site/noticias/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	@RequestMapping(value ="/curiosidades", method=RequestMethod.GET)
	public ModelAndView getCuriosidades() {
		ModelAndView mav = new ModelAndView("/site/curiosidades/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	@RequestMapping(value ="/tutoriais", method=RequestMethod.GET)
	public ModelAndView getTutoriais() {
		ModelAndView mav = new ModelAndView("/site/tutoriais/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	@RequestMapping(value ="/links", method=RequestMethod.GET)
	public ModelAndView getLinks() {
		ModelAndView mav = new ModelAndView("/site/links/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	
	
	@RequestMapping(value ="/downloads", method=RequestMethod.GET)
	public ModelAndView getDownloads() {
		ModelAndView mav = new ModelAndView("/site/downloads/index");
		Iterable<Mensagem> inicial = mir.findAll() ;
		mav.addObject("inicial",inicial);
		return mav;
	}
	

}
