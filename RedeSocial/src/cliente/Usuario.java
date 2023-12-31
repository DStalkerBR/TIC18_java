package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens;
	private int pontuacao;
	
	public Usuario(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.postagens = new ArrayList<String>();
		this.quantidadeDePostagens = 0;
		this.pontuacao = 0;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char sn = 's';
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

		while (sn != 'n') {
			Usuario novoUsuario;		
			String nome, email, nacionalidade, postagem;
			System.out.println("Criando um novo usuário...");		
			System.out.println("Digite o nome:");
			nome = entrada.nextLine();
			
			System.out.println("Digite o email:");
			email = entrada.nextLine();
			
			System.out.println("Digite a nacionalidade:");
			nacionalidade = entrada.nextLine();
			
			novoUsuario = new Usuario(nome, email, nacionalidade);
			
			System.out.println("Crie uma nova postagem:");
			postagem = entrada.nextLine();
			novoUsuario.adicionaPostagem(postagem);
			novoUsuario.alteraPontuacao(postagem.length());
			
			System.out.println("Crie uma nova postagem:");
			postagem = entrada.nextLine();
			novoUsuario.adicionaPostagem(postagem);
			novoUsuario.alteraPontuacao(postagem.length());
			
			System.out.println("Crie uma nova postagem:");
			postagem = entrada.nextLine();
			novoUsuario.adicionaPostagem(postagem);
			novoUsuario.alteraPontuacao(postagem.length());

			listaUsuarios.add(novoUsuario);
			System.out.println("Adicionar novo usuário?");
			sn = entrada.nextLine().charAt(0);			
		}

		for(Usuario usuario : listaUsuarios) {
			System.out.println("\nDados do usuário: ");
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Email: " + usuario.getEmail());
			System.out.println("Nacionalidade: " + usuario.getNacionalidade());
			System.out.println("Quantidade de Postagens: " + usuario.getQuantidadeDePostagens());
			System.out.println("Pontuação: " + usuario.getPontuacao() );
			System.out.println("\nPostagens do usuário: ");
			usuario.mostrarPostagens();
		}

		entrada.close();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void adicionaPostagem(String post) {
		postagens.add(post);
		this.quantidadeDePostagens += 1;
	}

	public ArrayList<String> getPostagens() {
		return postagens;
	}

	public void mostrarPostagens (){
		for (int i = 0; i < postagens.size(); i++) {
			System.out.println(postagens.get(i));
		}
	}

	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}
	
	public void alteraPontuacao(int delta) {
		if (pontuacao + delta > 0) {
			this.pontuacao += delta;
		}
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	
}
