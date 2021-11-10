	import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	
	static int tabela = 0;
	static int acao = 0;


	public static void main(String[] args) {
		leValores();
	}
	
	public static void leValores() {
		do {
//			System.out.println("Selecione a opcao que quer alterar, inserir ou deletar:");
	//		System.out.println("1- Loja");
		//	System.out.println("2- Vende");
			//System.out.println("3- Produto");
			//System.out.println("4- Sair");
			//Scanner sc = new Scanner(System.in);

			do {
				tabela = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opcao que quer alterar, inserir ou deletar:\n"
						+ "1- Loja\n"
						+ "2- Vende\n"
						+ "3- Produto\n"
						+ "4- Sair")); //sc.nextInt();
				if (tabela == 4) {
					System.exit(0);
				}
				if ((tabela != 1) && (tabela != 3) && (tabela != 2)) {
					JOptionPane.showMessageDialog(null, "Valor invalido, favor reinserir");//System.out.println("Valor invalido, favor reinserir");
				}
			} while ((tabela != 1) && (tabela != 2) && (tabela != 3));
			// System.out.println(tabela);
			if (tabela != 2) {
				//System.out.println("Selecione se quer alterar, inserir ou deletar:");
				//System.out.println("1- Alterar");
				//System.out.println("2- Inserir");
				//System.out.println("3- Deletar");
				do {
					acao = Integer.parseInt(JOptionPane.showInputDialog("Selecione se quer alterar, inserir ou deletar:\n"
							+ "1- Alterar\n"
							+ "2- Inserir\n"
							+ "3- Deletar\n"));//sc.nextInt();
					if ((acao != 1) && (acao != 2) && (acao != 3)) {
						JOptionPane.showMessageDialog(null,"Valor invalido, favor reinserir" );//System.out.println("Valor invalido, favor reinserir");
					}
				} while ((acao != 1) && (acao != 2) && (acao != 3));
			}
			// System.out.println(acao+ " "+tabela );
			String var1 = "";
			String var2 = "";
			int quant = 0;
			String s = Integer.toString(quant);
			float preco = 0;
			var1 = String.valueOf(JOptionPane.showInputDialog(""));//sc.nextLine();
			if (tabela == 1) {
				Loja loja = new Loja();
				if (acao == 2) {
					do {
						//System.out.println("Digite o nome da nova loja:");
						var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome da nova loja:"));//sc.nextLine();
						if (var1.length() > 17 || var1.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}
					} while (var1.length() > 17 || var1.length() < 1);

					do {
						//System.out.println("Digite o tema da nova loja:");
						var2 = String.valueOf(JOptionPane.showInputDialog("Digite o tema da nova loja:"));//sc.nextLine();
						if (var2.length() > 10 || var2.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}
					} while (var2.length() > 10 || var2.length() < 1);
					loja.InsereLoja(var1, var2);
				}
				if (acao == 3) {
					do {
					//	System.out.println("Digite o nome da loja a ser deletada:");
						var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome da loja a ser deletada:"));// sc.nextLine();
						if (var1.length() > 17 || var1.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}
					} while (var1.length() > 17 || var1.length() < 1);

					loja.DeletaLoja(var1);
				}
				if (acao == 1) {
					do {
						//System.out.println("Digite o nome da loja a ser alterada:");
						var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome da loja a ser alterada:"));//sc.nextLine();
						if (var1.length() > 17 || var1.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}

					} while (var1.length() > 17 || var1.length() < 1);

					boolean existe = loja.ChecaLoja(var1);
					//System.out.println(existe);
					JOptionPane.showMessageDialog(null,String.valueOf(existe));
					String var3 = var1;
					if (!existe) {
						//System.out.println("Loja nao exite, favor crie uma nova loja, ou reveja o nome.");
						JOptionPane.showMessageDialog(null, "Loja nao exite, favor crie uma nova loja, ou reveja o nome." );
					} else {
						do {
							//System.out.println("Digite o novo nome da loja:");
							var1 = String.valueOf(JOptionPane.showInputDialog("Digite o novo nome da loja:"));//sc.nextLine();
							if (var1.length() > 17 || var1.length() < 1) {
								JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
							}
						} while (var1.length() > 17 || var1.length() < 1);

						do {
							//System.out.println("Digite o novo tema da loja:");
							var2 = String.valueOf(JOptionPane.showInputDialog("Digite o novo tema da loja:"));// sc.nextLine();
							if (var2.length() > 10 || var2.length() < 1) {
								JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
							}
						} while (var2.length() > 10 || var2.length() < 1);
						loja.AlteraLoja(var1, var2, var3);
					}
				}
			}
			if (tabela == 3) {
				Produto produto = new Produto();
				if (acao == 2) {
					do {
						//System.out.println("Digite o nome do novo produto:");
						var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome do novo produto:"));// sc.nextLine();
						if (var1.length() > 15 || var1.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}
					} while (var1.length() > 15 || var1.length() < 1);

					do {
						//System.out.println("Digite a quantidade de produtos:");
						quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos:"));//sc.nextInt();
						s = Integer.toString(quant);
						if (s.length() > 5 || s.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//	System.out.println("Tamanho invalido favor redigite:");
						}
					} while (s.length() > 5 || s.length() < 1);
					do {
						//System.out.println("Digite o preco do produto:");
						preco = Float.valueOf(JOptionPane.showInputDialog("Digite o preco do produto:"));//sc.nextFloat();
						s = Float.toString(preco);
						if (s.length() > 10 || s.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}
					} while (s.length() > 10 || s.length() < 1);
					produto.InsereProduto(var1, quant, preco);
				}
				if (acao == 3) {
					do {
						//System.out.println("Digite o nome do produto:");
						var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome do produto:"));//sc.nextLine();
						if (var1.length() > 15 || var1.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}
					} while (var1.length() > 15 || var1.length() < 1);

					produto.DeletaProduto(var1);
				}
				if (acao == 1) {
					do {
						//System.out.println("Digite o nome do produto a ser alterado:");
						var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome do produto a ser alterado:"));//sc.nextLine();
						if (var1.length() > 15 || var1.length() < 1) {
							JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
						}

					} while (var1.length() > 15 || var1.length() < 1);

					boolean existe = produto.ChecaProduto(var1);
					JOptionPane.showMessageDialog(null,String.valueOf(existe));//System.out.println(existe);
					String var3 = var1;
					if (!existe) {
						//System.out.println("Produto nao exite, favor crie um novo produto, ou reveja o nome.");
						JOptionPane.showMessageDialog(null,"Produto nao exite, favor crie um novo produto, ou reveja o nome.");
					} else {
						do {
							//System.out.println("Digite o novo nome do produto:");
							var1 = String.valueOf(JOptionPane.showInputDialog("Digite o novo nome do produto:"));//sc.nextLine();
							if (var1.length() > 15 || var1.length() < 1) {
								JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
							}
						} while (var1.length() > 15 || var1.length() < 1);

						do {
							//System.out.println("Digite a nova quantidade de produtos:");
							quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de produtos:"));//sc.nextInt();
							s = Integer.toString(quant);
							if (s.length() > 5 || s.length() < 1) {
								JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
							}
						} while (s.length() > 5 || s.length() < 1);
						do {
							//System.out.println("Digite o novo preco do produto:");
							preco = Float.valueOf(JOptionPane.showInputDialog("Digite o novo preco do produto:"));//sc.nextFloat();
							s = Float.toString(preco);
							if (s.length() > 10 || s.length() < 1) {
								JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
							}
						} while (s.length() > 10 || s.length() < 1);
						produto.AlteraProduto(var1, var3, quant, preco);
					}
				}
			}
			if (tabela == 2) {
				Produto produto = new Produto();
				Loja loja = new Loja();
				Vende vende = new Vende();
				do {
					//System.out.println("Digite o nome do produto:");
					var1 = String.valueOf(JOptionPane.showInputDialog("Digite o nome do produto:"));//sc.nextLine();
					if (var1.length() > 15 || var1.length() < 1) {
						JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
					}
				} while (var1.length() > 15 || var1.length() < 1);
				do {
					//System.out.println("Digite o nome da loja:");
					var2 = String.valueOf(JOptionPane.showInputDialog("Digite o nome da loja:")); //sc.nextLine();
					if (var2.length() > 17 || var1.length() < 1) {
						JOptionPane.showMessageDialog(null,"Tamanho invalido favor redigite:" );//System.out.println("Tamanho invalido favor redigite:");
					}
				} while (var2.length() > 17 || var2.length() < 1);
				boolean existeP = produto.ChecaProduto(var1);
				if (!existeP) {
					//System.out.println("Produto nao exite, favor crie um novo produto, ou reveja o nome.");
					JOptionPane.showMessageDialog(null, "Produto nao exite, favor crie um novo produto, ou reveja o nome.");
				} else {

					boolean existeL = loja.ChecaLoja(var2);
					if (!existeL) {
						//System.out.println("Loja nao exite, favor crie uma nova loja, ou reveja o nome.");
						JOptionPane.showMessageDialog(null, "Loja nao exite, favor crie uma nova loja, ou reveja o nome.");
					} else {
						vende.InsereVende(var2, var1);
					}
				}
			}
		} while (tabela != 4);
	}
}
