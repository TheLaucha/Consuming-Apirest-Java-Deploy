package com.ideas.springboot.web.app.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ideas.springboot.web.app.service.TeamService;
import com.ideas.springboot.web.app.service.dto.team.DatosclimaService;
import com.ideas.springboot.web.app.service.dto.team.TeamResponse;


@RestController
@ComponentScan
public class TeamController {


    private final TeamService teamService;
    private final DatosclimaService datosClima;

    public TeamController(TeamService teamService, DatosclimaService datosClima) {
        this.teamService = teamService;
        this.datosClima = datosClima;
    }
 
    @PostMapping("/buscarclima")
    public TeamResponse buscarClima(@RequestParam String region) {
        TeamResponse respuesta = this.teamService.buscarClima(region);
        datosClima.create(respuesta);
        return respuesta;

    }



}