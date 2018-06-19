package br.com.selecao.s2it;

public class BinaryTree {
	private int valor;
	
	private String descricao;

	private BinaryTree left;

	private BinaryTree right;

	public BinaryTree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addNo(BinaryTree no) {
		
	}
	
	public boolean temAnterior() {
		return this.left == null ? false : true;
	}
	
	public boolean temProximo() {
		return this.right == null ? false : true;
	}
	
	public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
		super();
		this.valor = valor;
		this.left = left;
		this.right = right;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}
