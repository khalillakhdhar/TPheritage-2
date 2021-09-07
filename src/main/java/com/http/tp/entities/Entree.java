package com.http.tp.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entree extends Device  {
private int capacite;

public int getCapacite() {
	return capacite;
}

public void setCapacite(int capacite) {
	this.capacite = capacite;
}



}
