/**
 * Classe que registra o tempo online que é esperado de um aluno, o tempo esperado é o dobro do tempo da disciplina.
 * 
 * @author Emanuel Araújo de Moura - 119210350
 *
 */
public class RegistroTempoOnline {
	/**
	 * Nome da disciplina que será registrada.
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
	 * Construtor que o tempo esperado padrão é igual a 120 horas.
	 * 
	 * @param nomeDisciplina Nome da disciplina que será registrado.
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = 120;
	}
	
	/**
	 * Construtor que o tempo esperado é dado pelo usuário
	 * 
	 * @param nomeDisciplina Nome da disciplina que será registrado.
	 * @param tempoOnlineEsperado Tempo online esperado de um determinada disciplina.
	 */
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	/**
	 * Adiciona um quantidade de tempo utilizada online.
	 * @param tempo O tempo que será adicionado.
	 */
	public void adicionaTempoOnline(int tempo) {
		this.tempoOnlineUsado += tempo;
	}
	
	/**
	 * Verifica se atingiu a meta de tempo online de uma disciplina.
	 * @return Se o tempo online usado for maior que o tempo online esperado, retorna true, caso contrário, retorna false.
	 */
	public boolean atingiuMetaTempoOnline() {
		if(this.tempoOnlineUsado >= this.tempoOnlineEsperado) {
			return true;
		}
		return false;
	}
	
	/**
	 * Método que retorna uma representação textual de um registro de tempo online, no seguinte formato:
	 * nomeDisciplina tempoOnlineUsado/tempoOnlineEsperado
	 */
	public String toString() {
		return this.nomeDisciplina + " " + this.tempoOnlineUsado + "/" + this.tempoOnlineEsperado;
	}
}
