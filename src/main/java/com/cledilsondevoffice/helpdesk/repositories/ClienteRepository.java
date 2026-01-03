package com.cledilsondevoffice.helpdesk.repositories;

import com.cledilsondevoffice.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
