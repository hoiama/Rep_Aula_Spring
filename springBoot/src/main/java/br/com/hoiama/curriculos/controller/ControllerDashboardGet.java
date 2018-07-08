package br.com.hoiama.curriculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.hoiama.curriculos.model.entity.Curriculo;
import br.com.hoiama.curriculos.regras.RegraNegocio;

@Controller
public class ControllerDashboardGet {
	
	@Autowired
	RegraNegocio regras;
	
	/**
	 * GET : Página do curriculo Real do usuário
	 * @return página do curriculo em sí
	 */
	@Cacheable(value="curriculo")
	@RequestMapping("/dashboard")
	public String dashboard(Model modelAndView) {
		Curriculo curriculoPronto = regras.getCurriculo();
		modelAndView.addAttribute("curriculo", curriculoPronto);
		return "Dashboard";
	}

	
	/**
	 * GET : Formulário de preenchimento do currículo
	 * @return página de formulário do currículo
	 */
	@Cacheable(value="formulario")
	@RequestMapping("/dashboard-formulario")
	public String dashboardFormulario() {
		return "DashboardFormulario";
	}
	
	
	/**
	 * GET : Painel de Administração dos curriculos cadastrados
	 * @return página do painel de administração do curriculo
	 */
	@RequestMapping("/admin")
	public String dashboardAdmin() {
		return "DashboardAdmin";
	}
	
	

	
	
	

}

