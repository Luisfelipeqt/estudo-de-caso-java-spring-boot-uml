package com.feliperodrigues.estudodecasouml.estudocasouml.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.*;

import com.feliperodrigues.estudodecasouml.estudocasouml.entities.Estado;
import com.feliperodrigues.estudodecasouml.estudocasouml.services.EstadoService;


@RestController
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;

	/*@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public ResponseEntity<List<Estado>> findAll(){
		List<Estado> obj = estadoService.findAll();
		return ResponseEntity.ok().body(obj);
	}*/

	@RequestMapping(value = "/estados/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Estado>> findById(@PathVariable Integer id){
		Estado obj = estadoService.findById(id);
        return ResponseEntity.ok().body(Optional.ofNullable(obj));
    }

	@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public String privateRoute(@AuthenticationPrincipal OidcUser principal){
		return String.format("<h1>Private route, only authorized personal! </h1>" +
				"<h3>Principal: %s </h3>" +
				"<h3>Email attribute: %s </h3>" +
				"<h3>Authorities: %s </h3>" +
				"<h3>JWT: %s</h3>", principal, principal.getAttributes(), principal.getAuthorities(), principal.getIdToken().getTokenValue());
	}
}
