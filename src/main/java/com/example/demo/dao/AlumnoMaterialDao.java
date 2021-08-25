package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AlumnoMateria;
import com.example.demo.entity.AlumnoMateriaId;

public interface AlumnoMaterialDao extends JpaRepository<AlumnoMateria, AlumnoMateriaId> {

	public AlumnoMateria findByAlumno_idAndMateria_id(Long alumno_id,Long materia_id);
	
	public void deleteByAlumno_idAndMateria_id(Long alumno_id,Long materia_id);
	
	
}
