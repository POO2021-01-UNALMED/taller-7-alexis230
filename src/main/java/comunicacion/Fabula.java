package comunicacion;

public class Fabula extends Escrito{
	private String ense�anza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas,String ense�anza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ense�anza=ense�anza;
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
                + getPaginas() + "\n" + ense�anza;
    }

	public String getEnse�anza() {
		return ense�anza;
	}

	public void setEnse�anza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
