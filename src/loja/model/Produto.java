package loja.model;

import loja.util.Cores;

public abstract class Produto {

	private String nome;
	private String marca;
	private int codigo;
	private float preco;

	public Produto(String nome, String marca, int codigo, float preco) {
		this.nome = nome;
		this.marca = marca;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void exibirDetalhes() {
		System.out.println(Cores.TEXT_RED_BRIGHT + "*************************************************************"
				+ Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_CYAN_BOLD + "Detalhes do Produto:" + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_WHITE_BOLD + "Código gerado: " + getCodigo());
		System.out.println(Cores.TEXT_WHITE_BOLD + "Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Preço: R$ " + getPreco());

	}

}
