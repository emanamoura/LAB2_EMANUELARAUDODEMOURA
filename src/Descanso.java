/**
 * Classe que representa o descanso de um aluno no COISA. O n�mero de horas de descanso, quando constr�i-se o objeto, � igual a 0.
 * Assim, para ficar descanso � necess�rio ter 26 horas de descanso por semana.
 * 
 * @author Emanuel Ara�jo de Moura - 119210350
 */
public class Descanso {

	/**
	 * Atributo privado que guarda as horas de descanso
	 */
	private int horasDescanso;
	/**
	 * Atributo privado que guarda o n�mero de semanas que o aluno vai descansar.
	 */
	private int numeroSemanas;
	
	/**
	 * Construtor do Descanso, um descanso � come�ado com 0 horas de descanso e 0 n�mero de semanas.
	 */
	public Descanso() {
		this.horasDescanso = 0;
		this.numeroSemanas = 0;
	}
	
	/**
	 * M�todo p�blico que retorna o estado geral do descanso, se o descanso for maior ou igual a 26h/semana, a pessoa est� descansada.
	 * @return Retorna uma string com o estado do aluno
	 */
	public String getStatusGeral() {
		if(numeroSemanas == 0) {
			if(this.horasDescanso < 26) {
				return "cansado";
			}
			return "descansado";
		}
		int numeroDeVerificacao = this.horasDescanso / numeroSemanas;
		if(numeroDeVerificacao < 26) {
			return "cansado";
		}
		return "descansado";
	}
	
	/**
	 * M�todo sem retorno que define as horas de descanso
	 * 
	 * @param horasDescanso As horas do descanso
	 */
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	/**
	 * M�todo sem retorno que define o n�mero de semanas
	 * 
	 * @param numeroSemanas N�meros de semana
	 */
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
}
