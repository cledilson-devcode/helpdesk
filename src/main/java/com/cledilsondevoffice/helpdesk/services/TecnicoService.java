package com.cledilsondevoffice.helpdesk.services;

import com.cledilsondevoffice.helpdesk.domain.Pessoa;
import com.cledilsondevoffice.helpdesk.domain.Tecnico;
import com.cledilsondevoffice.helpdesk.dtos.TecnicoDTO;
import com.cledilsondevoffice.helpdesk.repositories.PessoaRepository;
import com.cledilsondevoffice.helpdesk.repositories.TecnicoRepository;
import com.cledilsondevoffice.helpdesk.services.excepitons.DataIntegrityViolationException;
import com.cledilsondevoffice.helpdesk.services.excepitons.ObjectNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> tecnico = tecnicoRepository.findById(id);
        return tecnico.orElseThrow(() -> new ObjectNotFountException("Objeto não encontrado! ID: " + id));
    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    public Tecnico create(TecnicoDTO objDTO) {
        objDTO.setId(null);
        validaCpfEmail(objDTO);
        Tecnico newObj = new Tecnico(objDTO);
        return tecnicoRepository.save(newObj);
    }

    private void validaCpfEmail(TecnicoDTO objDTO) {

        Optional<Pessoa> obj = pessoaRepository.findByCpf(objDTO.getCpf());
        if (obj.isPresent() && !Objects.equals(obj.get().getId(), objDTO.getId())){
            throw new DataIntegrityViolationException("CPF já cadastrado no sistema!");
        }

        obj = pessoaRepository.findByEmail(objDTO.getEmail());
        if (obj.isPresent() && !Objects.equals(obj.get().getId(), objDTO.getId())){
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
        }

    }
}
