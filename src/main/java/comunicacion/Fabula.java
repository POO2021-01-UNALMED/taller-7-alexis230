package comunicacion;

public class Fabula extends Escrito{
	private String enseñanza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza=enseñanza;
		this.interpretacion=interpretacion;
		// TODO Auto-generated constructor stub
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		int total=getPaginas()*palabrasPagina*1;
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n"
                + getPaginas() + "\n" + enseñanza;
    }

	public String getEnseñanza() {
		return enseñanza;
	}

	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
