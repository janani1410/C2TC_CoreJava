package com.cg.day3;

public class Encap {
	private int id;
	private String name;
	private String dep;
	public Encap() {
		
	}
	@Override
	public String toString() {
		return "Dataset [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	

}
