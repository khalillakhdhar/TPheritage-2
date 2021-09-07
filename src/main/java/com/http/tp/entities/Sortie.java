package com.http.tp.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Sortie extends Device {
private int resolution;

public int getResolution() {
	return resolution;
}

public void setResolution(int resolution) {
	this.resolution = resolution;
}

}
