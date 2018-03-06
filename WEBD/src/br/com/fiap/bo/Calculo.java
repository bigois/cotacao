package br.com.fiap.bo;

import java.util.Date;

import br.com.fiap.models.Cotacao;

public class Calculo {
	public double CalcularCotacao(Cotacao cot) {
		Date dataInicio = cot.getDataInicio();
		Date dataFim = cot.getDataFim();
		Long dias = 0L;
		
		dias = (dataInicio.getTime() - dataFim.getTime()) / (1000 * 60 * 60 * 24);
		
		return (cot.getValor() * 0.01) * dias;
	}
}
