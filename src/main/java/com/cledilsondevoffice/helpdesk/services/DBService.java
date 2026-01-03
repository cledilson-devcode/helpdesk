package com.cledilsondevoffice.helpdesk.services;

import com.cledilsondevoffice.helpdesk.domain.Chamado;
import com.cledilsondevoffice.helpdesk.domain.Cliente;
import com.cledilsondevoffice.helpdesk.domain.Tecnico;
import com.cledilsondevoffice.helpdesk.domain.enuns.Perfil;
import com.cledilsondevoffice.helpdesk.domain.enuns.Prioridade;
import com.cledilsondevoffice.helpdesk.domain.enuns.Status;
import com.cledilsondevoffice.helpdesk.repositories.ChamadoRepository;
import com.cledilsondevoffice.helpdesk.repositories.ClienteRepository;
import com.cledilsondevoffice.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;


    public void instanciaDB(){

        Tecnico tec1 = new Tecnico(null, "Valdir cezar", "09098789088", "valdir@hmotmail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Lineus Lineu", "34523465467", "torcalsd@gmail.com", "123");

        Chamado c1 = new Chamado(null, Status.ANDAMENTO, Prioridade.MEDIA, "Chamado 01", "Primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));

    }

}
