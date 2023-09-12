package br.com.senai.cardapiosmktplaceapi.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.senai.cardapiosmktplaceapi.entity.Categoria;
import br.com.senai.cardapiosmktplaceapi.entity.Opcao;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class OpcaoService implements br.com.senai.cardapiosmktplaceapi.service.OpcaoService {

	@Override
	public Opcao salvar(Opcao opcao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarStatusPor(Integer id, Status status) {
		// TODO Auto-generated method stub

	}

	@Override
	public Page<Opcao> listarPor(String nome, Categoria categoria,
			Status status, Pageable paginacao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Opcao buscarPor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Opcao excluirPor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
