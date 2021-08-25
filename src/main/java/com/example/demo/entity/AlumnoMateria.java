package com.example.demo.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="alumnoMateria")
@IdClass(AlumnoMateriaId.class)
public class AlumnoMateria {

	@Id
	private Long idAlumno;
	@Id
	private Long idMateria;
	private Double calificacion;
	
	@ManyToOne
	@JoinColumn(name ="idAlumno", referencedColumnName = "id", insertable = false,updatable = false)
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name ="idMateria", referencedColumnName = "id", insertable = false,updatable = false)
	private Materia materia;
}
