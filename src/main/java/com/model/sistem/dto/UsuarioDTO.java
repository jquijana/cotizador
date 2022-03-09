package com.model.sistem.dto;

import com.model.sistem.entities.Usuario;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTO {
	
	private Long id;
	
	private String nombre;
	private String clave;
}
