/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Persistencia de objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/
package modelo;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String origem;
	private ArrayList<Jogo> jogos = new ArrayList<>();
	private boolean finalizado = false;

	
	public Time(String nome, String origem) {
		super();
		this.nome = nome;
		this.origem = origem;
	}

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}

	public double obterValorArrecadado() {
		double soma=0;
		for(Jogo j : jogos)
			soma = soma + j.obterValorArrecadado();
		
		return soma;
	}

	public void adicionar(Jogo j) {
		jogos.add(j);
	}
	public void remover(Jogo j) {
		jogos.remove(j);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public String toString() {
		String texto = "nome=" + nome + ", origem=" + origem ;
		
		texto += 	"\njogos: " ;
		for(Jogo j : jogos)
			texto += j.getId() +"=" + j.getData()+ "," + j.getLocal() +"  ";
		return texto;
	}

	
	
}
