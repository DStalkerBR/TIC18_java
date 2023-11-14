// Exercicio Aula 02: OO em C++ e em Java
// Comparando orientação em objetos em Java e C++

package oop;

import java.util.Scanner;

public class Book {
	private String author;
	private String nome;
	private String publisher;
	private int numberOfCopies;
	private long isbn;
	private double price;
	private int publicationYear;	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome e Pressione <Enter>");
		String mensagem = entrada.nextLine();
		System.out.println("Oi " + mensagem);
	}
	
	public Book(String author, String nome, String publisher, int numberOfCopies, long isbn, double price,
			int publicationYear) {
		super();
		this.author = author;
		this.nome = nome;
		this.publisher = publisher;
		this.numberOfCopies = numberOfCopies;
		this.isbn = isbn;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public long getISBN() {
		return isbn;
	}
	public void setISBN(long iSBN) {
		isbn = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public boolean greaterThan (Book _book) {
		return this.publicationYear > _book.publicationYear;
	} 
	
	public boolean equals (Book _book) {
		return this.publicationYear == _book.publicationYear;
		
	} 
}

/*class BooksInfo
{
private:
	string Book_Title;
	string Book_author;
	string Book_publisher;
	int Number_Of_Copies {};
	long ISBN {};
	double price {};
	int Publication_Year {};

public:
	BooksInfo() {}

	BooksInfo(const string& bt, const string& ba, const string& bp, int noc, long ISB, double pr, int py) :
		Book_Title(bt), Book_author(ba), Book_publisher(bp), Number_Of_Copies(noc), ISBN(ISB), price(pr), Publication_Year(py) {}

	BooksInfo(const BooksInfo& BI) : Book_Title(BI.Book_Title), Book_author(BI.Book_author), Book_publisher(BI.Book_publisher),
		Number_Of_Copies(BI.Number_Of_Copies), ISBN(BI.ISBN), price(BI.price), Publication_Year(BI.Publication_Year) {}

	void setBook_Title(const string& BT) { Book_Title = BT; }
	void setBook_author(const string& BA) { Book_author = BA; }
	void setBook_publisher(const string& BP) { 	Book_publisher = BP; }
	void setNumber_Of_Copies(int NOC) { Number_Of_Copies = NOC; }
	void setISBN(int IS) { 	ISBN = IS; }
	void setprice(double pr) { 	price = pr; }
	void setPublication_Year(int PY) { Publication_Year = PY; }

	string getBook_Title() const { 	return Book_Title; }
	string getBook_author() const { return Book_author; }
	string getBook_publisher() const { return Book_publisher; }
	int getNumber_Of_Copies() const { return Number_Of_Copies; }
	int getISBN() const { return ISBN; }
	double getprice() const { return price; }
	int getPublication_Year() const { return Publication_Year; }

	bool operator >= (const BooksInfo& b)
	{
		return Publication_Year >= b.Publication_Year;
	}

	bool operator == (BooksInfo b)
	{
		return Publication_Year == b.Publication_Year;
	}
};
*/
