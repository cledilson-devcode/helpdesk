package com.cledilsondevoffice.helpdesk;

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
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpDeskApplication {



    public static void main(String[] args) {
        SpringApplication.run(HelpDeskApplication.class, args);
    }


}
