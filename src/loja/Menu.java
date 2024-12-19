package loja;

import java.util.Scanner;

import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, codigo;
		float preco;
		String nomeProduto;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               GENERATION ELETRÔNICOS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar um Produto                 ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar produto por codigo            ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Excluir produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSaindo do sistema...");
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar um Produto\n");

				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				System.out.println("Digite o preço do produto: ");
				preco = leia.nextFloat();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n");

				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar produto - por código\n\n");

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar produtos\n\n");

				System.out.println("Digite o nome do produto: ");
				nomeProduto = leia.next();

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "Excluir produtos\n");

				System.out.println("Digite o nome do produto: ");
				nomeProduto = leia.next();

				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;

			}

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
