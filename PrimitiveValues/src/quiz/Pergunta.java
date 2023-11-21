package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Pergunta {
	private String texto;
	private ArrayList<String> alternativas;
	private int alternativaCerta;
	
	public Pergunta() {
		this.texto = "";
		this.alternativas = new ArrayList<String>();
		this.alternativaCerta = 0;
	}
	
	public Pergunta(String texto, ArrayList<String> alternativas, int alternativaCerta) {
		super();
		this.texto = texto;
		this.alternativas = alternativas;
		this.alternativaCerta = alternativaCerta;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ArrayList<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	}

	public int getAlternativaCerta() {
		return alternativaCerta;
	}

	public void setAlternativaCerta(int alternativaCerta) {
		this.alternativaCerta = alternativaCerta;
	}
	
	private void mostrarAlternativas() {
		for (int i = 0; i < alternativas.size(); i++) {
			System.out.println(String.valueOf(i + 1) + " " + alternativas.get(i));
		}
	}

	public void criarPergunta() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Texto da pergunta: ");
		this.texto = entrada.nextLine();
		System.out.println("Adicione a 1ª alternativa: ");
		this.alternativas.add(entrada.nextLine());
		System.out.println("Adicione a 2ª alternativa: ");
		this.alternativas.add(entrada.nextLine());
		System.out.println("Adicione a 3ª alternativa: ");
		this.alternativas.add(entrada.nextLine());
		System.out.println("Adicione a 4ª alternativa: ");
		this.alternativas.add(entrada.nextLine());
		this.mostrarAlternativas();
		System.out.println("Alternativa certa (Numero): ");
		this.alternativaCerta = entrada.nextInt();
		entrada.close();
	}
	
	public boolean executarPergunta() {
		Scanner entrada = new Scanner(System.in);
		System.out.println(this.texto);
		this.mostrarAlternativas();
		int alternativa = entrada.nextInt();
		entrada.close();
		if(alternativa == this.alternativaCerta) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Pergunta> showDoMilhao = new ArrayList<Pergunta>();
		int quantAltCerta = 0;
		Pergunta pergunta1 = new Pergunta();
		pergunta1.criarPergunta();
		Pergunta pergunta2 = new Pergunta();
		pergunta2.criarPergunta();
		Pergunta pergunta3 = new Pergunta();
		pergunta3.criarPergunta();
		showDoMilhao.add(pergunta1);
		showDoMilhao.add(pergunta2);
		showDoMilhao.add(pergunta3);
		for(Pergunta pergunta : showDoMilhao) {
			if (pergunta.executarPergunta()) {
				quantAltCerta += 1;
			}
		}
		System.out.println( quantAltCerta + " corretas de " + showDoMilhao.size() + " questões");
		
	}

}
