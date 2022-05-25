/**
 * Classe que registra as as atividades complementrares de um estudante no COISA.
 * @author Emanuel Ara�jo de Moura - 119210350
 *
 */
public class AtividadesComplementares {
	
	
	private int[] estagios;
	private double[] cursos;
	private int[] projetos;
	private int estagiosContador;
	private int cursosContador;
	private int projetosContador;
	private int horasEstagio;
	private int horasCurso;
	private int mesesProjeto;
	
	public AtividadesComplementares() {
			this.estagios = new int[9];
			this.projetos = new int[16];
			this.cursos = new double[20];
			this.estagiosContador = 0;
			this.cursosContador = 0;
			this.projetosContador = 0;
	}
	
	public void adicionarEstagio(int horasEstagio) {
		this.estagios[estagiosContador] = horasEstagio;
		this.horasEstagio += horasEstagio;
		this.estagiosContador += 1;
		
	}

	public void adicionarCurso(double horasCurso) {
		this.cursos[cursosContador] = horasCurso;
		this.horasCurso += horasCurso;
		this.cursosContador += 1;
	
	}

	public void adicionarProjeto(int mesesProjeto) {
		this.projetos[projetosContador] = mesesProjeto;
		this.mesesProjeto += mesesProjeto;
		projetosContador += 1;
	}

	public String[] pegaAtividades() {
		String resultado = "";
		double horasCurso = 0;
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
		for(int i = 0; i < this.cursos.length; i++) {
			if(this.cursos[i] == 0) {
				break;
			}
			horasCurso += this.cursos[i];
		}
		resultado += "Cursos " + horasCurso;
		resultado += "\n" + "Credito_Estagio " + this.contaCreditoEstagio()  + "\n"
				+ "Creditos_Projeto " + this.contaCreditoProjeto()  + "\n"
				+ "Creditos_Cursos " + this.contaCreditoCurso();	
		return resultado.split(",");
	}
	
	private int contaCreditoEstagio() {
		int numeroArredondadoParaBaixo = (int) this.horasEstagio / 300;
		return numeroArredondadoParaBaixo * 5;
	}
	
	private int contaCreditoCurso() {
		int numeroArredondadoParaBaixo = (int) this.horasCurso / 30;
		return numeroArredondadoParaBaixo * 1;
	}
	
	private int contaCreditoProjeto() {
		int numeroArredondadoParaBaixo = (int) this.mesesProjeto / 3;
		return numeroArredondadoParaBaixo * 2;
	}
	
	

	public int contaCreditos() {
		return  this.contaCreditoCurso() + this.contaCreditoEstagio() + this.contaCreditoProjeto();
	}
}
