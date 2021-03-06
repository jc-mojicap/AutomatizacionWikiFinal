package edu.uniandes.automatizacion.servicios.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "acceso")
public class Acceso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Basic(optional = false)
    @Column(nullable = false)
	private String ip;
	
	@Basic(optional = false)
    @Column(nullable = false)
	private int usuario;
	
	@Basic(optional = false)
    @Column(nullable = false, name="token_usado")
	private String tokenUsado;
	
	@Basic(optional = false)
    @Column(nullable = false, name="fecha_acceso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAcceso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public String getTokenUsado() {
		return tokenUsado;
	}

	public void setTokenUsado(String tokenUsado) {
		this.tokenUsado = tokenUsado;
	}

	public Date getFechaAcceso() {
		return fechaAcceso;
	}

	public void setFechaAcceso(Date fechaAcceso) {
		this.fechaAcceso = fechaAcceso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acceso other = (Acceso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acceso [" + (id != null ? "id=" + id + ", " : "")
				+ (ip != null ? "ip=" + ip + ", " : "") + "usuario=" + usuario + ", "
				+ (tokenUsado != null ? "tokenUsado=" + tokenUsado + ", " : "")
				+ (fechaAcceso != null ? "fechaAcceso=" + fechaAcceso : "") + "]";
	}
	
}
