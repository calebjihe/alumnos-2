package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlumnoMaterialDao;
import com.example.demo.entity.AlumnoMateria;
import com.example.demo.entity.AlumnoMateriaId;


@Service
public class AlumnoMateriaServiceImpl implements AlumnoMateriaService {

	@Autowired
	private AlumnoMaterialDao alumnoMaterialDao;
	@Override
	public List<AlumnoMateria> findAll() {
		return alumnoMaterialDao.findAll();
	}

	@Override
	public AlumnoMateria findByAlumnoMateria(Long alumno_id, Long materia_id) {
		return alumnoMaterialDao.findByAlumno_idAndMateria_id(alumno_id, materia_id);
	}

	@Override
	public AlumnoMateria save(Long alumno_id, Long materia_id, Double calificacion) {
		AlumnoMateria am=new AlumnoMateria();
		am=alumnoMaterialDao.findByAlumno_idAndMateria_id(alumno_id, materia_id);
		am.setCalificacion(calificacion);
		return alumnoMaterialDao.save(am);
	}

	@Override
	public AlumnoMateria update(Long alumno_id, Long materia_id, Double calificacion) {
		AlumnoMateria am=new AlumnoMateria();
		am=alumnoMaterialDao.findByAlumno_idAndMateria_id(alumno_id, materia_id);
		am.setCalificacion(calificacion);
		return alumnoMaterialDao.save(am);
	}

	@Override
	public void delete(Long alumno_id, Long materia_id) {
		AlumnoMateria am=new AlumnoMateria();
		am=alumnoMaterialDao.findByAlumno_idAndMateria_id(alumno_id, materia_id);
		am.setCalificacion(0.0);
		alumnoMaterialDao.save(am);

	}

}
