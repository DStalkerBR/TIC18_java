package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Pergunta {
	private String texto;
	private ArrayList<String> alternativas;
	private int alternativaCerta;
	private Scanner entrada;
	
	public Pergunta() {
		this.texto = "";
		this.alternativas = new ArrayList<String>();
		this.alternativaCerta = 0;
		this.entrada = new Scanner(System.in);
	}
	
	public Pergunta(String texto, ArrayList<String> alternativas, int alternativaCerta) {
		super();
		this.texto = texto;
		this.alternativas = alternativas;
		this.alternativaCerta = alternativaCerta;
		this.entrada = new Scanner(System.in);
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
			System.out.println(String.valueOf(i + 1) + ". " + alternativas.get(i));
		}
	}

	public void criarPergunta() {
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
	}
	
	public boolean executarPergunta() {
		System.out.println(this.texto);
		this.mostrarAlternativas();
		System.out.println("Qual a alternativa correta? ");
		int alternativa = entrada.nextInt();
		return alternativa == this.alternativaCerta;
	}
}
