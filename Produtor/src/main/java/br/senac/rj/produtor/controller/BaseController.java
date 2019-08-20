package br.senac.rj.produtor.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public abstract class BaseController<T> {
	
	@Autowired
	protected T service;
	
	protected ObjectMapper mapper = new ObjectMapper();
	
	protected XmlMapper xmlMapper = new XmlMapper();
	
	protected String retorno;

}
