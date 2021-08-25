package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Alumno;

public interface AlumnoDao extends JpaRepository<Alumno, Long> {

	//public Alumno findByAlumno_idAndMateria_id(Long alumno_id,Long materia_id);
}
