package co.edu.udistrital.model;

import java.util.Objects;

public class LoteChocolate {
	
	private String idLote;
	private double porcentajeCacao;
	private String fechaProduccion;
	private boolean aprobado;
	
	public LoteChocolate(String idLote, double porcentajeCacao, String fechaProduccion, boolean aprobado) {
        this.idLote = idLote;
        this.porcentajeCacao = porcentajeCacao;
        this.fechaProduccion = fechaProduccion;
        this.aprobado = aprobado;
    }

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public double getPorcentajeCacao() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoteChocolate that = (LoteChocolate) o;
        return Objects.equals(idLote, that.idLote);
    }

	@Override
	public String toString() {
		return "\n LoteChocolate [idLote=" + idLote + ", porcentajeCacao=" + porcentajeCacao + ", fechaProduccion="
				+ fechaProduccion + ", aprobado=" + aprobado + "]";
	}
	
	
	
}
