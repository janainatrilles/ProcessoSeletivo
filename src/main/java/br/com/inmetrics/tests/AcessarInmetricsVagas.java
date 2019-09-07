package br.com.inmetrics.tests;

import br.com.inmetrics.cfg.Browser;
import br.com.inmetrics.pos.InmetricsHome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcessarInmetricsVagas {

	@When("usuario acessa pagina home")
	public void usuario_acessa_pagina_home() {
	    Browser.driver().get("https://www.inmetrics.com.br/");
	}
	
	@Then("usuario acessa pagina vagas")
	public void usuario_acessa_pagina_vagas() {
		InmetricsHome home = new InmetricsHome(Browser.driver());
		home.acesseVagas();
	}
	
}
