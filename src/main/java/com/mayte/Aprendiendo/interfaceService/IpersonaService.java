package com.mayte.Aprendiendo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.mayte.Aprendiendo.models.person;

public interface IpersonaService {
	public List<person>listar();
	public Optional<person>listarId(int id);
	public int save(person p);
	public void delete(int id);		
}
