package br.com.hoiama.curriculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hoiama.curriculos.model.entity.Curriculo;
import br.com.hoiama.curriculos.regras.RegraNegocio;

@Controller
public class ControllerDashBoardRest {

	@Autowired
	RegraNegocio regras;
	
	@RequestMapping(value="/api-curriculoO")
	@ResponseBody
	public Curriculo getCurriculo() {
		return regras.getCurriculo();
	}
}
