package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AlumnoMateriaId implements Serializable {


	private static final long serialVersionUID = -7770040441451569570L;

	@Column(name = "idAlumno")
	private Long idAlumno;
	
	@Column(name = "idMateria")
	private Long idMateria;
}