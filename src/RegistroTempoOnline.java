/**
 * Classe que registra o tempo online que � esperado de um aluno, o tempo esperado � o dobro do tempo da disciplina.
 * 
 * @author Emanuel Ara�jo de Moura - 119210350
 *
 */
public class RegistroTempoOnline {
	/**
	 * Nome da disciplina que ser� registrada.
	 */
	private String nomeDisciplina;
	/**
	 * Tempo online esperado para uma determinada disciplina.
	 */
	private int tempoOnlineEsperado;
	/**
	 * Tempo online usado para uma determinada disciplina.
	 */
	private int tempoOnlineUsado;

	/**
	 * Construtor que o tempo esperado padr�o � igual a 120 horas.
	 * 
	 * @param nomeDisciplina Nome da disciplina que ser� registrado.
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = 120;
	}
	
	/**
	 * Construtor que o tempo esperado � dado pelo usu�rio
	 * 
	 * @param nomeDisciplina Nome da disciplina que ser� registrado.
	 * @param tempoOnlineEsperado Tempo online esperado de um determinada disciplina.
	 */
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	/**
	 * Adiciona um quantidade de tempo utilizada online.
	 * @param tempo O tempo que ser� adicionado.
	 */
	public void adicionaTempoOnline(int tempo) {
		this.tempoOnlineUsado += tempo;
	}
	
	/**
	 * Verifica se atingiu a meta de tempo online de uma disciplina.
	 * @return Se o tempo online usado for maior que o tempo online esperado, retorna true, caso contr�rio, retorna false.
	 */
	public boolean atingiuMetaTempoOnline() {
		if(this.tempoOnlineUsado >= this.tempoOnlineEsperado) {
			return true;
		}
		return false;
	}
	
	/**
	 * M�todo que retorna uma representa��o textual de um registro de tempo online, no seguinte formato:
	 * nomeDisciplina tempoOnlineUsado/tempoOnlineEsperado
	 */
	public String toString() {
		return this.nomeDisciplina + " " + this.tempoOnlineUsado + "/" + this.tempoOnlineEsperado;
	}
}
