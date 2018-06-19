package br.com.selecao.s2it;

public final class Questao9 {

	static void executar() {
		
		BinaryTree noRaiz = buscarArvore();
		int valoresSubSequente = somaValoresSubSequente(noRaiz);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("O somatório dos valores subsequente ao nó raiz é: ");
		stringBuilder.append(valoresSubSequente);
		
		System.out.println(stringBuilder.toString());
	}
	
	private static BinaryTree buscarArvore() {
		BinaryTree noRaiz = new BinaryTree();
		noRaiz.setValor(1);

		BinaryTree noFolha1 = new BinaryTree();
		noFolha1.setValor(2);
		noFolha1.setLeft(noRaiz);

		noRaiz.setRight(noFolha1);

		BinaryTree noFolha2 = new BinaryTree();
		noFolha2.setValor(3);
		noFolha2.setLeft(noFolha1);

		noFolha1.setRight(noFolha2);

		return noRaiz;
	}

	private static int somaValoresSubSequente(BinaryTree no) {
		if (!no.temProximo()) {
			return 0;
		}

		return somaValoresSubSequente(no.getRight()) + no.getRight().getValor();
	}
}
