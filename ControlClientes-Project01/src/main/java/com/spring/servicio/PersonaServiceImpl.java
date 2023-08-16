//capa de servicio o capa logica
package com.spring.servicio;

import com.spring.dao.PersonaDao;
import com.spring.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Para que spring reconozca esta clase como clase de servicio se agrega service
//sirve para inyectar como una implementacion de la intefaz(personaService)
//al controlador de spring
//el controlador va usar la capa de personaServiceImpl
//conectar la capa de sevicios con nuestra capa de datos

@Service
public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
