package com.afiportal.service;

import com.afiportal.dao.AgentRepo;
import com.afiportal.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AgentService {

    @Autowired
    private AgentRepo agentRepo;

    @PostConstruct
    public void initAgent(){
        agentRepo.saveAll(Stream.of(
                new Agent(1, "John", "029309"),
                new Agent(2, "Wick", "029310")
        ).collect(Collectors.toList()));
    }

    public List<Agent> listAllAgents(){
        return agentRepo.findAll();
    }
}
