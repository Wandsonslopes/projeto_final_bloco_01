package loja;

import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.ProdutoController;
import loja.model.ProdutosEletronicos;
import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produto = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao;
		int codigo = 0;
		String categoria;
		String nome;
		String marca;
		float preco;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					         + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               GENERATION ELETRÔNICOS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar produto por codigo            ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Excluir produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {

				opcao = leia.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;

			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSaindo do sistema...");
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar um Produto\n");

				System.out.println("Digite a categoria do produto: ");
				categoria = leia.next();

				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("Digite a marca do produto: ");
				marca = leia.next();

				System.out.println("Digite o preço do produto: ");
				preco = leia.nextFloat();

				produto.cadastrar(new ProdutosEletronicos(marca, nome, produto.gerarCodigo(), preco, categoria));

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n");

				produto.listar();

				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar produto por código\n\n");

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				produto.procurarPorCodigo(codigo);

				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar produtos\n\n");

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				var buscarCodigo = produto.buscarNaCollection(codigo);

				if (buscarCodigo != null) {

					System.out.println("Digite a categoria do produto: ");
					categoria = leia.next();

					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("Digite a marca do produto: ");
					marca = leia.next();

					System.out.println("Digite o preço do produto: ");
					preco = leia.nextFloat();

					produto.atualizar(new ProdutosEletronicos(nome, marca, codigo, preco, categoria));

				} else {
					System.out.println("Produto não encontrado!");
				}

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "Excluir produtos\n");

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				produto.deletar(codigo);

				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;

			}

			leia.close();
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Francisco Wandson - wandson_lopes@hotmail.com");
		System.out.println("https://github.com/Wandsonslopes");
		System.out.println("*********************************************************");
	}
}
