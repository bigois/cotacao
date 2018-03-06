package br.com.fiap.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.Calculo;
import br.com.fiap.models.Cotacao;

@WebServlet("/cotacao_servlet")
public class CotacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CotacaoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "cotacao.jsp";

		try {
			String nome = request.getParameter("nome");
			String produto = request.getParameter("produto");
			String valor = request.getParameter("valor");
			String dataInicio = request.getParameter("dataInicio");
			String dataFim = request.getParameter("dataFim");

			if (nome.isEmpty() || produto.isEmpty() || valor.isEmpty() || dataInicio.isEmpty() || dataFim.isEmpty()) {
				url = "entrada.jsp";
				request.setAttribute("erro", "Informe o valor de todos os campos");
			} else {
				Cotacao cot = new Cotacao(nome, produto, Double.parseDouble(valor),
						new SimpleDateFormat("dd/MM/YYYY").parse(dataInicio),
						new SimpleDateFormat("dd/MM/YYYY").parse(dataFim));

				double custo = new Calculo().CalcularCotacao(cot);
			}


		} catch (Exception e) {
			e.printStackTrace();
			url = "erro.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
