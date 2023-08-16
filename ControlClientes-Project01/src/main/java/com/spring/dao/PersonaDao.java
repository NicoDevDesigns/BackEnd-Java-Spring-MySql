//Capa de datos
package com.spring.dao;

import com.spring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

    
public interface PersonaDao extends CrudRepository<Persona,Long>{
    
}
