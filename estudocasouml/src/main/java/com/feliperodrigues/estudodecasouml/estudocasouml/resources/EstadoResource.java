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
@RequestMapping(value = "/estados")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;

	@GetMapping
	public ResponseEntity<List<Estado>> findAll() {
		List<Estado> obj = estadoService.findAll();
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/estados/{id}")
	public ResponseEntity<Optional<Estado>> findById(@PathVariable Integer id) {
		Estado obj = estadoService.findById(id);
		return ResponseEntity.ok().body(Optional.ofNullable(obj));
	}
}






