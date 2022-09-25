package br.primeiroprojeto.quarkus.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.primeiroprojeto.quarkus.model.Bitcoin;
import br.primeiroprojeto.quarkus.service.BitcoinService;

@Path("/bitcoins") // path do controller "endpoint"
public class BitcoinResource {

	@Inject // fazer a injeção de dependência
	@RestClient // fazer a injeção de dependência
	BitcoinService bitcoinService;
	
	
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> listar() {
		return bitcoinService.listar();
	}

}