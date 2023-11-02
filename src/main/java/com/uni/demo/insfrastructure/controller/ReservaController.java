/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uni.demo.insfrastructure.controller;

import com.uni.demo.app.service.ReservaService;
import com.uni.demo.insfrastructure.entity.ReservaEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Aarón López
 */

@Controller
@RequestMapping("/home")
public class ReservaController {
    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }
    
    @GetMapping("/reserva")
    public String MostrarPagina(){
        return "user/reserva";
    }
    
    @PostMapping("/guardar")
    public String guardarReserva(ReservaEntity reserva){
        reservaService.saveReserva(reserva);
        
        return "redirect:/home/reserva";
    }
    
    @GetMapping("/mostrar")
    public String mostrarReserva(Model model){
        Iterable<ReservaEntity> reserva = reservaService.getReserva();
        model.addAttribute("reservas", reserva);
        return "user/reserva";
    }
    
    @GetMapping("/eliminar")
    public String eliminarReserva(@PathVariable Integer Id){
        reservaService.deleteReservaById(Id);
        return "redirect:/home/reserva";
    }
}