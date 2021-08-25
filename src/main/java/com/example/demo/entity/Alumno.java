package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {

	private static final long serialVersionUID = -1977950717807420105L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String app;
	private String apm;
	//private Double calificacion;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="alumnos_materias",
				joinColumns = @JoinColumn(name="alumno_id"),
				inverseJoinColumns = @JoinColumn(name="materia_id"),
				uniqueConstraints = {@UniqueConstraint(columnNames = {"alumno_id","materia_id"})})
	private List<Materia> materias;

	

}
