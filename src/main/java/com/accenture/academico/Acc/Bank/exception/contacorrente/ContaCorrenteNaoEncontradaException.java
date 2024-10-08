package com.accenture.academico.Acc.Bank.exception.contacorrente;

import org.springframework.http.HttpStatus;

import com.accenture.academico.Acc.Bank.exception.NegocioException;

public class ContaCorrenteNaoEncontradaException extends NegocioException{

	public ContaCorrenteNaoEncontradaException(Long idConta) {
		super(String.format("Não existe uma conta corrente cadastrada com o id %d.", idConta));
        this.httpStatus = HttpStatus.NOT_FOUND;
	}
	
	public ContaCorrenteNaoEncontradaException(String numeroConta) {
		super(String.format("Não existe uma conta corrente cadastrada com o número %s.", numeroConta));
        this.httpStatus = HttpStatus.NOT_FOUND;
	}
}
