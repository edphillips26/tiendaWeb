
package com.TiendaWeb.service;

import com.TiendaWeb.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
    public List<Persona>getAllPersona();
    public Persona getPersonabyId(Long id);
    public void savePersona(Persona persona);
    public void delete(long id);

    public List<Persona> getALLPersona();

    public Persona getPersonaById(Long idPersona);
}
