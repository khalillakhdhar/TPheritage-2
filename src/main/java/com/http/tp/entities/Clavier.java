package com.http.tp.entities;

import javax.persistence.Entity;

@Entity
public class Clavier extends Entree {
private String mode;

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}

}
