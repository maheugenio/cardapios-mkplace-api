package br.com.senai.cardapiosmktplaceapi.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.senai.cardapiosmktplaceapi.entity.Secao;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import br.com.senai.cardapiosmktplaceapi.service.SecaoService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class SecaoServiceImpl implements SecaoService {

	@Override
	public Secao salvar(Secao secao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarStatusPor(Integer id, Status status) {
		// TODO Auto-generated method stub

	}

	@Override
	public Page<Secao> listarPor(String nome, Pageable paginacao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Secao buscarPor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Secao excluirPor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
