package com.cledilsondevoffice.helpdesk.services;

import com.cledilsondevoffice.helpdesk.domain.Tecnico;
import com.cledilsondevoffice.helpdesk.dtos.TecnicoDTO;
import com.cledilsondevoffice.helpdesk.repositories.TecnicoRepository;
import com.cledilsondevoffice.helpdesk.services.excepitons.ObjectNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> tecnico = tecnicoRepository.findById(id);
        return tecnico.orElseThrow(() -> new ObjectNotFountException("Objeto não encontrado! ID: " + id));
    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    public Tecnico create(TecnicoDTO objDTO) {
        objDTO.setId(null);
        Tecnico newObj = new Tecnico(objDTO);
        return tecnicoRepository.save(newObj);
    }
}
