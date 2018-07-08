package br.com.hoiama.curriculos.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerDashboardPost {

	
		/**
		 * Gravar Curso no banco de dados
		 * @param nomeCurso
		 * @param instituicao
		 * @param ano
		 * @return
		 */
		@CacheEvict(value="curriculo", allEntries=true)
		@RequestMapping(value="/salvar", method= RequestMethod.POST)
		public String salvar(@RequestParam("nomeCurso") String nomeCurso,
								@RequestParam("instituicao") String instituicao,
								@RequestParam("ano") int ano) {
				
			return "DashboardFormulario";
		}
}
