package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AlumnoMateria;
import com.example.demo.entity.AlumnoMateriaId;

public interface AlumnoMateriaService {

	public List<AlumnoMateria> findAll();
	public AlumnoMateria findByAlumnoMateria (Long alumno_id, Long materia_id);
	public AlumnoMateria save (Long alumno_id, Long materia_id,Double calificacion);
	public AlumnoMateria update (Long alumno_id, Long materia_id,Double calificacion);
	public void delete (Long alumno_id, Long materia_id);
	
}
