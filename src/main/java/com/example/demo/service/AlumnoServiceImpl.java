package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlumnoDao;
import com.example.demo.entity.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	private AlumnoDao alumnoDao;

	@Override
	public List<Alumno> findAll() {
		return alumnoDao.findAll();
	}

}
