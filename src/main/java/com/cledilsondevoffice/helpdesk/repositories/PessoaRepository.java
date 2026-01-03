package com.cledilsondevoffice.helpdesk.repositories;

import com.cledilsondevoffice.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {



}
