package com.ideas.springboot.web.app.controllers;

import java.util.Map;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
/*
    @GetMapping("verdetalleclima")
    public String verdetalleclima(Map<String, Object> model) {
        return "verdetalleclima";
      }

    @GetMapping("")
    public String buscarclima(Map<String, Object> model) {
        return "buscarclima";
      }
      */

    //@CrossOrigin(origins = "http://localhost:5173") 
    //@PostMapping("/buscarclima")
    @GetMapping("/buscarclima")
    public TeamResponse buscarClima(/*@RequestParam String region*/) {
        String region = "Cordoba";
        TeamResponse respuesta = this.teamService.buscarClima(region);
        datosClima.create(respuesta);
        return respuesta;
        
   // @PostMapping("/buscarclima")
   // public String buscarclima(@RequestParam String region, Map<String, Object> model) {
    	//region = "Argentina";
    	//TeamResponse respuesta = this.teamService.buscarClima(region);
    	//model.put("clima", respuesta);
    	//datosClima.create(respuesta);
       // return "verdetalleclima";
    }



}