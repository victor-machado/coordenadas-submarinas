package br.com.coordenadas.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.coordenadas.business.CoordenadasBO;

@RestController
public class CoordenadasController {
	@RequestMapping(value = "/coordenadas/{command}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCoordinateByCommand(@PathVariable String command) {
		CoordenadasBO bo = new CoordenadasBO();
		return bo.calcularCoordenada(command);
	} 
}
