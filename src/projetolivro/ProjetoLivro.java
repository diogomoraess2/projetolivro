package projetolivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		p[0] = new Pessoa("Pedro", 22, 'M');
		p[1] = new Pessoa("Mariana", 26, 'F');
		
		Livro[] l = new Livro[3];
		l[0] = new Livro("Java para iniciantes", "Maria Lúcia Blanck Lisbôa", 704, p[1]);
		l[1] = new Livro("Algoritmos - teoria e prática", "Thomas Cormen", 944, p[0]);
		l[2] = new Livro("Código Limpo", "Robert C. Martin", 425, p[1]);
		
		System.out.println(l[0].detalhes());
		l[0].abrir();
		l[0].avancarPag();
		l[0].voltarPag();
		l[0].voltarPag();
		l[0].avancarPag();
		l[0].folhear(703);
		l[0].folhear(1);
		l[0].folhear(850);
		l[0].voltarPag();
	}
}
