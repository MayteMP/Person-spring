package com.mayte.Aprendiendo.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mayte.Aprendiendo.models.person;

@Repository
public interface IPersona extends CrudRepository<person, Integer>{

}
