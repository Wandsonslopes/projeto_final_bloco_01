package loja.controller;

import java.util.ArrayList;

import loja.model.Produto;
import loja.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int codigo;

	@Override
	public void procurarPorCodigo(int codigo) {
		var procurar = buscarNaCollection(codigo);

		if (procurar != null) {
			procurar.exibirDetalhes();
		} else {
			System.out.println("O produto " + codigo + " não encontado!");
		}

	}

	@Override
	public void listar() {

		for (Produto produto : listaProdutos) {
			produto.exibirDetalhes();
		}

	}

	@Override
	public void cadastrar(Produto produto) {

		listaProdutos.add(produto);
		System.out.println("Produto " + produto.getCodigo() + " cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getCodigo());

		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.println("Produto " + produto.getCodigo() + " atualizado com sucesso!");
		}

	}

	@Override
	public void deletar(int codigo) {
		var deletarProduto = buscarNaCollection(codigo);

		if (deletarProduto != null) {
			if (listaProdutos.remove(deletarProduto) == true) {
				System.out.println("Produto " + codigo + " excluído com sucesso!");
			}
		} else {
			System.out.println("Produto " + codigo + " não encontrado!");

		}

	}

	public int gerarCodigo() {
		return ++codigo;
	}

	public Produto buscarNaCollection(int codigo) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}

}
