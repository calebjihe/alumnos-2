package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AlumnoMateria;
import com.example.demo.service.AlumnoMateriaService;

@RestController
public class AlumnoMateriaController {

	@Autowired
	private AlumnoMateriaService alumnoMateriaService;
	
	@GetMapping("/listarcalificacion")
	public List<AlumnoMateria> listar(){
		return alumnoMateriaService.findAll();
	}
	
	@PostMapping("/registrarCalificacion/idalumno/{idalumno}/idmateria/{idmateria}/calificacion/{calificacion}")
	public AlumnoMateria calificar(@PathVariable Long idalumno,
			@PathVariable Long idmateria,
			@PathVariable Double calificacion) {
		return alumnoMateriaService.save(idalumno, idmateria, calificacion);
	}
	
	@PutMapping("/editarCalificacion/idalumno/{idalumno}/idmateria/{idmateria}/calificacion/{calificacion}")
	public AlumnoMateria updateCali(@PathVariable Long idalumno,
			@PathVariable Long idmateria,
			@PathVariable Double calificacion) {
		return alumnoMateriaService.save(idalumno, idmateria, calificacion);
	}
	@DeleteMapping("/eliminarCalificacion/idalumno/{idalumno}/idmateria/{idmateria}")
	public void deleteCali(@PathVariable Long idalumno,
			@PathVariable Long idmateria) {
			alumnoMateriaService.delete(idalumno, idmateria);
	}
}
