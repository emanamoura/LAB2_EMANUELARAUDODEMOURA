/**
 * Classe que representa o descanso de um aluno no COISA. O número de horas de descanso, quando constrói-se o objeto, é igual a 0.
 * Assim, para ficar descansado é  necessário ter 26 horas de descanso por semana.
 * 
 * @author Emanuel Araújo de Moura - 119210350
 */
public class Descanso {

	/**
	 * Atributo privado que guarda as horas de descanso
	 */
	private int horasDescanso;
	/**
	 * Atributo privado que guarda o número de semanas que o aluno vai descansar.
	 */
	private int numeroSemanas;
	
	/**
	 * Construtor do Descanso, um descanso é começado com 0 horas de descanso e 0 número de semanas.
	 */
	public Descanso() {
		this.horasDescanso = 0;
		this.numeroSemanas = 0;
	}
	
	/**
	 * Método público que retorna o estado geral do descanso, se o descanso for maior ou igual a 26h/semana, a pessoa está descansada.
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
	 * Método sem retorno que define as horas de descanso.
	 * 
	 * @param horasDescanso As horas do descanso
	 */
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	/**
	 * Método sem retorno que define o número de semanas.
	 * 
	 * @param numeroSemanas Números de semana
	 */
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
}
