package com.mayte.Aprendiendo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayte.Aprendiendo.interfaceService.IpersonaService;
import com.mayte.Aprendiendo.interfaces.IPersona;
import com.mayte.Aprendiendo.models.person;

@Service
public class PersonaService implements IpersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<person> listar() {
		// TODO Auto-generated method stub
		return (List<person>)data.findAll();
	}

	@Override
	public Optional<person> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(person p) {
		// TODO Auto-generated method stub
		int res = 0;
		person person = data.save(p);
		if(!person.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
