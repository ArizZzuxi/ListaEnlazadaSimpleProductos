package co.edu.udistrital.model;

public class LoteChocolate {
	
	private int idLote;
	private int porcentajeCacao;
	private String fechaProduccion;
	private boolean aprobado;
	
	public LoteChocolate(int idLote, int porcentajeCacao, String fechaProduccion, boolean aprobado) {
		this.idLote = idLote;
		this.porcentajeCacao = porcentajeCacao;
		this.fechaProduccion = fechaProduccion;
		this.aprobado = aprobado;
	}

	public int getIdLote() {
		return idLote;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public int getPorcentajeCacao() {
		return porcentajeCacao;
	}

	public void setPorcentajeCacao(int porcentajeCacao) {
		this.porcentajeCacao = porcentajeCacao;
	}

	public String getFechaProduccion() {
		return fechaProduccion;
	}

	public void setFechaProduccion(String fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
	}

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	@Override
	public String toString() {
		return "LoteChocolate [idLote=" + idLote + ", porcentajeCacao=" + porcentajeCacao + ", fechaProduccion="
				+ fechaProduccion + ", aprobado=" + aprobado + "]";
	}
	
	
	
}
