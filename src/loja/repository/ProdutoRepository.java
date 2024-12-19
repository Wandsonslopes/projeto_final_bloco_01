package loja.repository;

import loja.model.Produto;

public interface ProdutoRepository {

	public void procurarPorCodigo(int codigo);

	public void listar();

	public void cadastrar(Produto produto);

	public void atualizar(Produto produto);

	public void deletar(int codigo);

}
