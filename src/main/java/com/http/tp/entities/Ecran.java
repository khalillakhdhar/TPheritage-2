package com.http.tp.entities;

import javax.persistence.Entity;

@Entity
public class Ecran extends Sortie {
private String  qualite;

public String getQualite() {
	return qualite;
}

public void setQualite(String qualite) {
	this.qualite = qualite;
}




}
