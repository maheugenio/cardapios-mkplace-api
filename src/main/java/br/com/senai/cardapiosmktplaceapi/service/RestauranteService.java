package br.com.senai.cardapiosmktplaceapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import br.com.senai.cardapiosmktplaceapi.entity.Categoria;
import br.com.senai.cardapiosmktplaceapi.entity.Restaurante;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Validated
public interface RestauranteService {

	public Restaurante salvar(
			@NotNull(message = "O restaurante é obrigatório")
			Restaurante restaurante);
	
	public void atualizarStatusPor(
			@NotNull(message = "O id é obrigatório")
			@Positive(message = "O id deve ser positivo")
			Integer id, 
			@NotNull(message = "O status é obrigatório")
			Status status);
	
	public Page<Restaurante> listarPor(
			@NotBlank(message = "O nome é obrigatório")
			@Size(min = 3, max = 250, message = "O nome para listagem deve conter entre 3 e 250 caracteres")
			String nome, 
			@NotNull(message = "A categoria é obrigatória")
			Categoria categoria, 
			Pageable paginacao);
	
	public Restaurante buscarPor(
			@NotNull(message = "O id é obrigatório")
			@Positive(message = "O id deve ser positivo")
			Integer id);
	
	public Restaurante excluirPor(
			@NotNull(message = "O id para exclusão é obrigatório")
			@Positive(message = "O id para exclusão deve ser positivo")
			Integer id);
	
}
