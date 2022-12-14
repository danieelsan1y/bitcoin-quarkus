package br.primeiroprojeto.quarkus.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.primeiroprojeto.quarkus.model.Bitcoin;
import br.primeiroprojeto.quarkus.service.BitcoinService;

@Path("/bitcoins") // chamar api externa
@RegisterRestClient(configKey = "bitcoin-api") // permitir a injeção de dependência
public interface BitcoinService {

	@GET 
	@Produces(MediaType.APPLICATION_JSON) // o objeto será do tipo JSON
	public List<Bitcoin> listar();

}