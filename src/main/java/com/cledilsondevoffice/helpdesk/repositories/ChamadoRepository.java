package com.cledilsondevoffice.helpdesk.repositories;

import com.cledilsondevoffice.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
