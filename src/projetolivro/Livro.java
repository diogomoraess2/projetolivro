package projetolivro;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public String detalhes() {
		return "Livro \n[titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor + "]\n";
	}
	
	@Override
	public void abrir() {
		if (isAberto() == false) {
			setAberto(true);
			setPagAtual(1);
			System.out.println("O livro \"" + getTitulo() + "\" foi aberto.\n");
		}else {
			System.out.println("O livro \"" + getTitulo() + "\" j� est� aberto.\n");
		}
	}
	
	@Override
	public void fechar() {
		if (isAberto() == true) {
			setAberto(false);
			setPagAtual(1);
			System.out.println("O livro \"" + getTitulo() + "\" foi fechado.\n");
		}else {
			System.out.println("O livro \"" + getTitulo() + "\" j� est� fechado.\n");
		}
	}
	@Override
	public void folhear(int p) {
		if (isAberto() == true) {
			if (p > 0) {
				if (p <= getTotPaginas()) {
					setPagAtual(p);
					System.out.println("P�gina atual: " + getPagAtual() + ".\n");
				}else {
					System.out.println("Imposs�vel folhear a p�gina solicitada, pois o livro possui apenas " + getTotPaginas() + " p�ginas.\n");
				}
			}else {
				System.out.println("P�gina inexistente.\n");
			}
		}else {
			System.out.println("O livro est� fechado, abra o livro para folhe�-lo.\n");
		}
	}
	
	@Override
	public void avancarPag() {
		if (isAberto() == true) {
			if (getTotPaginas() >= getPagAtual() + 1) {
				setPagAtual(getPagAtual() + 1);
				System.out.println("Voc� avan�ou a p�gina! P�gina atual: " + getPagAtual() + ".\n");
			} else {
				System.out.println("Imposs�vel avan�ar a p�gina, pois voc� j� est� na �ltima p�gina.\n");
			}
		}else {
			System.out.println("O livro est� fechado, abra o livro para avan�ar as p�ginas.\n");
		}
	}
	
	@Override
	public void voltarPag() {
		if (isAberto() == true) {
			if (1 <= getPagAtual() - 1) {
				setPagAtual(getPagAtual() - 1);
				System.out.println("Voc� voltou a p�gina! P�gina atual: " + getPagAtual() + "\n");
			} else {
				System.out.println("Imposs�vel voltar a p�gina, pois voc� j� est� na primera p�gina.\n");
			}
		}else {
			System.out.println("O livro est� fechado, abra o livro e folheie para  p�gina 2 ou avence at� a p�gina 2 para poder voltar a p�gina.\n");
		}
	}
}
