/**
 * Classe que representa uma disciplina do COISA.
 * Cada discplina possui um nome, a quantidade de horas e 4 notas.
 * 
 * @author Emanuel Araújo de Moura - 119210350
 */
public class Disciplina {
	/**
	 * Atributo do tipo String que se refere ao nome da disciplina. 
	 */
	private String nomeDisciplina;
	
	/**
	 * Atributo do tipo int que se refere a quantidade de horas de uma disciplina. 
	 */
	private int horas;
	/**
	 * Atributo que se refere as notas da disciplina. As notas são guardadas dentro de um array do tipo double. 
	 */
	private double[] notas;
	
	/**
	 * Constrói uma disciplina com o nome da disciplina, além disso, toda disciplina começa com 0 horas.
	 * 
	 * @param nomeDisciplina Nome da disciplina.
	 */
	private int[] pesosDeNotas;
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.horas = 0;
		this.notas = new double[4];
		this.pesosDeNotas = new int[4];
		this.populaArrayComPesoDefinido(1);
	}
	
	public Disciplina(String nomeDisciplina, int numerosDeNotas ) {
		this.nomeDisciplina = nomeDisciplina;
		this.horas = 0;
		this.notas = new double[numerosDeNotas];
		this.populaArrayComPesoDefinido(1);
	}
	
	public Disciplina(String nomeDisciplina, int numerosDeNotas, int[] pesosDeNotas ) {
		this.nomeDisciplina = nomeDisciplina;
		this.horas = 0;
		this.notas = new double[numerosDeNotas];
		this.pesosDeNotas = pesosDeNotas;
	}
	
	/**
	 * O método cadastra horas na disciplina, recebendo um inteiro como parâmetro.
	 *
	 * @param horas Quantidade de horas de uma determinada disciplina.
	 * 
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	
	/**
	 * O método cadastra qual a posição da nota e o valor da nota, 
	 * caso o valor da posição da nota não esteja entre 1 e 4, 
	 * É apresentado uma mensagem pedindo para o usuário colocar um valor diferente.
	 *
	 * @param nota é um int, que representa a posição da nota.
	 * @param valorNota é um double, que representa o valor da nota.
	 *
	 */
	public void cadastraNota(int nota, double valorNota) {
		if(nota <= 0 || nota > 4) {
			System.out.println("Insira um valor entre 1 e 4, incluindo eles mesmos.");
		}else {
			this.notas[nota - 1] = valorNota;
		}
		
	}
	
	
	/**
	 * O método calcula a média da disciplina.
	 * 
	 * @return Um double, com a média das notas da disciplina.
	 */
	private double calculaMedia() {
		double soma = 0;
		int somaDosPesos = 0;
		for(int i = 0; i < this.notas.length; i++) {
			soma += this.notas[i] * this.pesosDeNotas[i];
			somaDosPesos += this.pesosDeNotas[i];
		}
		double media = soma / somaDosPesos;
		return media;
	}
	
	/**
	 * O método retorna uma string com as notas no seguinte formato:
	 * [nota1, nota2, nota3, nota4]
	 *	
	 *@return uma String que representa as notas da disciplina.
	 */
	private String mostraNotas() {
		String saida = "[";
		for(int i = 0; i < this.notas.length; i++) {
			if(i == this.notas.length - 1) {
				saida = saida + Double.toString(notas[i]) + ']';
			}else {
				saida = saida + Double.toString(notas[i]) + ", ";
			}
		}
		return saida;
	}
	
	
	/**
	 * O método verifica se a pessoa está aprovado na disciplina.
	 * Caso a nota seja menor que 7, retorna false. Caso maior ou igual a 7, retorna true.
	 * 
	 * @return Retorna um boolean. Se calculaMedia menor 7, retorna false, caso contr�rio, retorna true.
	 */
	public boolean aprovado() {
		if(calculaMedia() < 7) {
			return false;
		}
		return true;
	}
	
	private void populaArrayComPesoDefinido(int pesoPadrao) {
		for(int i = 0; i < this.pesosDeNotas.length; i++) {
			this.pesosDeNotas[i] = pesoPadrao;
		}
	}
	
	/**
	 * Retorna uma String com o seguinte formato:
	 * "nomeDisciplina horas valorMedia [nota1, nota2, nota3, nota4]".
	 * 
	 * @return Retorna uma String com uma representação de uma disciplina.
	 */
	public String toString() {
		return this.nomeDisciplina + " " + this.horas + " " + calculaMedia() + " " + mostraNotas();
	}	
}