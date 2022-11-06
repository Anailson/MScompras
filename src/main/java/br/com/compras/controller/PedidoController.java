package br.com.compras.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.compras.model.Pedido;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@PostMapping
	public ResponseEntity<Pedido> salvar(@RequestBody Pedido pedido){
		
		return ResponseEntity.ok(pedido);
		
		
	}

}
