/**
 * Classe que registra as as atividades complementrares de um estudante no COISA.
 * @author Emanuel Araújo de Moura - 119210350
 *
 */
public class AtividadesComplementares {
	
	/**
	 * Atributo privado do tipo array de inteiros que guarda as horas dos estágios de um aluno, cada índice é um estágio.
	 */
	private int[] estagios;
	/**
	 * Atributo privado do tipo array de inteiros que a quantidade de meses de um projeto, cada índice é um projeto.
	 */
	private int[] projetos;
	/**
	 * Atributo do tipo inteiro que guarda a posição do array do último estágio adicionado.
	 */
	private int estagiosContador;
	/**
	 * Atributo do tipo inteiro que guarda a posição do array do último projeto adicionado.
	 */
	private int projetosContador;
	/**
	 * Atributo do tipo inteiro que guarda as horas totais dos estágios.
	 */
	private int horasEstagio;
	/**
	 * Atributo do tipo inteiro que guarda as horas totais dos cursos.
	 */
	private double horasCurso;
	/**
	 * Atributo do tipo inteiro que guarda a quantidade total de meses dos projetos.s
	 */
	private int mesesProjeto;
	
	/**
	 * Construtor público da classe AtividadesComplementares. Como padrão é apenas possível adicionar seis estágios e 16 projetos. E 100 cursos.
	 * Além disso, os contadores também iniciam com zero.
	 */
	public AtividadesComplementares() {
			this.estagios = new int[9];
			this.projetos = new int[16];
			this.estagiosContador = 0;
			this.projetosContador = 0;
	}
	
	/**
	 * Método sem retorno que conta as horas de um estágio e adiciona um estágio em um array.
	 * @param horasEstagio A quantidade de horas de um estágio.
	 */
	public void adicionarEstagio(int horasEstagio) {
		this.estagios[estagiosContador] = horasEstagio;
		this.horasEstagio += horasEstagio;
		this.estagiosContador += 1;
		
	}
	
	/**
	 * Método sem retorno que adiciona as horas de um curso.
	 * @param horasCurso A quantidade de horas de um curso.
	 */
	public void adicionarCurso(double horasCurso) {
		this.horasCurso += horasCurso;
	}

	/**
	 * Método sem retorno que adiciona os meses de um projeto em um array de projetos.
	 * @param mesesProjeto A quantidade de meses de um projeto.
	 */
	public void adicionarProjeto(int mesesProjeto) {
		this.projetos[projetosContador] = mesesProjeto;
		this.mesesProjeto += mesesProjeto;
		projetosContador += 1;
	}

	/**
	 * Método que retorna um array de Strings. É responsável por retornar as horas de cada estágio, os projetos e seus meses. Além das horas totais dos cursos.
	 * Ainda, ele retorna a quantidade de créditos de cada estágio, e no caso dos cursos, mostra os créditos e as horas totais de curso. Finalmente,
	 * na última posição do array ele mostra o total de créditos que o aluno possui.
	 * @return Retorna um array de strings com as informações das atividades complementares de um aluno no COISA.
	 */
	public String[] pegaAtividades() {
		String resultado = "";
		
		for(int i = 0; i < this.estagios.length; i++) {
			if(this.estagios[i] == 0) {
				break;
			}
			resultado +=  "Estagio " + this.estagios[i]  + "\n";
		}
		for(int i = 0; i < this.projetos.length; i++) {
			if(this.projetos[i] == 0) {
				break;
			}
			resultado +=   "Projeto " + this.projetos[i]  + "\n";
		}
		
		resultado += "Cursos " + this.horasCurso;
		resultado += "\n" + "Creditos_Estagio " + this.contaCreditoEstagio()  + "\n"
				+ "Creditos_Projeto " + this.contaCreditoProjeto()  + "\n"
				+ "Creditos_Cursos " + " " + this.contaCreditoCurso();	
		return resultado.split(",");
	}
	
	/**
	 * Método que retorna um inteiro que auxilia na contagem de créditos dos estágios.
	 * @return Retorna um inteiro com a quantidade de créditos dos estágios.
	 */
	private int contaCreditoEstagio() {
		int numeroArredondadoParaBaixo = (int) this.horasEstagio / 300;
		return numeroArredondadoParaBaixo * 5;
	}
	
	/**
	 * Método que retorna um inteiro que auxilia na contagem de créditos dos cursos.
	 * @return Retorna um inteiro com a quantidade de créditos dos cursos.
	 */
	private int contaCreditoCurso() {
		int numeroArredondadoParaBaixo = (int) this.horasCurso / 30;
		return numeroArredondadoParaBaixo * 1;
	}
	
	/**
	 * Método que retorna um inteiro que auxilia na contagem de créditos dos projetos.
	 * @return Retorna um inteiro com a quantidade de créditos dos projetos.
	 */
	private int contaCreditoProjeto() {
		int numeroArredondadoParaBaixo = (int) this.mesesProjeto / 3;
		return numeroArredondadoParaBaixo * 2;
	}
	
	
	/**
	 * Método público que conta todos os créditos de um aluno no COISA.
	 * @return Retorna a quantidade de créditos de um aluno no COISA.
	 */
	public int contaCreditos() {
		return  this.contaCreditoCurso() + this.contaCreditoEstagio() + this.contaCreditoProjeto();
	}
}
