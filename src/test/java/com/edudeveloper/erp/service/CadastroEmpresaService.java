package com.edudeveloper.erp.service;

import java.io.Serializable;

import com.edudeveloper.erp.model.Empresa;
import com.edudeveloper.erp.repository.Empresas;
import com.edudeveloper.erp.repository.Inject;
import com.edudeveloper.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;

	@Transacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}

	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}
}