/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uni.demo.app.service;

import com.uni.demo.insfrastructure.entity.ReservaEntity;
import com.uni.demo.app.repository.ReservaRepository;
import java.util.Optional;

/**
 *
 * @author Aarón López
 */

public class ReservaService {
    
    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }
    
    
    public Iterable<ReservaEntity> getReserva(){
        
        return reservaRepository.getReserva();
        
    }
    
    public Optional<ReservaEntity> getReservaById(Integer reservaId){
        
        return reservaRepository.getReservaById(reservaId);
        
    }
    
    public ReservaEntity saveReserva(ReservaEntity reserva){
        
        return reservaRepository.saveReserva(reserva);    
    
    }
    
    public void deleteReservaById(Integer id){
        
        reservaRepository.deleteReservaById(id);
        
    }
    
}