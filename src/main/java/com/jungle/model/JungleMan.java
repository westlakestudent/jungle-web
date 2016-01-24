package com.jungle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_jungle")
public class JungleMan {

	private String junglename;
	private String junglepush;
	private String junglepull;
	private String junglefuck;
	private String junglepapa;
	private int id;

	@GeneratedValue
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJunglename() {
		return junglename;
	}

	public void setJunglename(String junglename) {
		this.junglename = junglename;
	}

	public String getJunglepush() {
		return junglepush;
	}

	public void setJunglepush(String junglepush) {
		this.junglepush = junglepush;
	}

	public String getJunglepull() {
		return junglepull;
	}

	public void setJunglepull(String junglepull) {
		this.junglepull = junglepull;
	}

	public String getJunglefuck() {
		return junglefuck;
	}

	public void setJunglefuck(String junglefuck) {
		this.junglefuck = junglefuck;
	}

	public String getJunglepapa() {
		return junglepapa;
	}

	public void setJunglepapa(String junglepapa) {
		this.junglepapa = junglepapa;
	}

	public JungleMan(String junglename, String junglepush, String junglepull, String junglefuck, String junglepapa) {
		super();
		this.junglename = junglename;
		this.junglepush = junglepush;
		this.junglepull = junglepull;
		this.junglefuck = junglefuck;
		this.junglepapa = junglepapa;
	}

}
