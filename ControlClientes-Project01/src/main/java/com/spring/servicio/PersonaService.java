
package com.spring.servicio;

//interface que va a contener los metodos que se van a usar en la clase

import com.spring.domain.Persona;
import java.util.List;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);
    
}
