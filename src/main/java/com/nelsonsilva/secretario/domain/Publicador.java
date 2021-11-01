package com.nelsonsilva.secretario.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
//	private String endereco;
//	private String tel1;
//	private String tel2;
//	private char sexo;
//	private Date dataNascimento;
//	private Date dataBatismo;
//	private boolean ungido;
//	private boolean anciao;
//	private boolean servo;
//	private boolean pioneiro;
//	private boolean ativo;
//	private Integer grupo;
//	private boolean saida;
	
	public Publicador() {
		
	}

//	public Publicador(Integer id, String nome, String endereco, String tel1, String tel2, char sexo,
//			Date dataNascimento, Date dataBatismo, boolean ungido, boolean anciao, boolean servo, boolean pioneiro,
//			boolean ativo, Integer grupo, boolean saida) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.endereco = endereco;
//		this.tel1 = tel1;
//		this.tel2 = tel2;
//		this.sexo = sexo;
//		this.dataNascimento = dataNascimento;
//		this.dataBatismo = dataBatismo;
//		this.ungido = ungido;
//		this.anciao = anciao;
//		this.servo = servo;
//		this.pioneiro = pioneiro;
//		this.ativo = ativo;
//		this.grupo = grupo;
//		this.saida = saida;
//	}

	public Publicador(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public String getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(String endereco) {
//		this.endereco = endereco;
//	}
//
//	public String getTel1() {
//		return tel1;
//	}
//
//	public void setTel1(String tel1) {
//		this.tel1 = tel1;
//	}
//
//	public String getTel2() {
//		return tel2;
//	}
//
//	public void setTel2(String tel2) {
//		this.tel2 = tel2;
//	}
//
//	public char getSexo() {
//		return sexo;
//	}
//
//	public void setSexo(char sexo) {
//		this.sexo = sexo;
//	}
//
//	public Date getDataNascimento() {
//		return dataNascimento;
//	}
//
//	public void setDataNascimento(Date dataNascimento) {
//		this.dataNascimento = dataNascimento;
//	}
//
//	public Date getDataBatismo() {
//		return dataBatismo;
//	}
//
//	public void setDataBatismo(Date dataBatismo) {
//		this.dataBatismo = dataBatismo;
//	}
//
//	public boolean isUngido() {
//		return ungido;
//	}
//
//	public void setUngido(boolean ungido) {
//		this.ungido = ungido;
//	}
//
//	public boolean isAnciao() {
//		return anciao;
//	}
//
//	public void setAnciao(boolean anciao) {
//		this.anciao = anciao;
//	}
//
//	public boolean isServo() {
//		return servo;
//	}
//
//	public void setServo(boolean servo) {
//		this.servo = servo;
//	}
//
//	public boolean isPioneiro() {
//		return pioneiro;
//	}
//
//	public void setPioneiro(boolean pioneiro) {
//		this.pioneiro = pioneiro;
//	}
//
//	public boolean isAtivo() {
//		return ativo;
//	}
//
//	public void setAtivo(boolean ativo) {
//		this.ativo = ativo;
//	}
//
//	public Integer getGrupo() {
//		return grupo;
//	}
//
//	public void setGrupo(Integer grupo) {
//		this.grupo = grupo;
//	}
//
//	public boolean isSaida() {
//		return saida;
//	}
//
//	public void setSaida(boolean saida) {
//		this.saida = saida;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicador other = (Publicador) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
