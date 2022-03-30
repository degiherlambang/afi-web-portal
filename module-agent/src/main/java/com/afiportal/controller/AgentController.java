package com.afiportal.controller;

import com.afiportal.model.Agent;
import com.afiportal.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping("/getAllAgents")
    public List<Agent> getAllAgents(){
        return agentService.listAllAgents();
    }
}
