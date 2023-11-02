/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uni.demo.insfrastructure.adapter;

import com.uni.demo.insfrastructure.entity.ReservaEntity;
import com.uni.demo.app.repository.ReservaRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aarón López
 */

@Repository
public class ReservaRepositoryImpl implements ReservaRepository{

    private final ReservaCrudRepository reservaCrudRepository;

    public ReservaRepositoryImpl(ReservaCrudRepository reservaCrudRepository) {
        this.reservaCrudRepository = reservaCrudRepository;
    }

    @Override
    public Iterable<ReservaEntity> getReserva() {
        return reservaCrudRepository.findAll();
    }

    @Override
    public Optional<ReservaEntity> getReservaById(Integer reservaId) {
      return reservaCrudRepository.findById(reservaId);
    }

    @Override
    public ReservaEntity saveReserva(ReservaEntity reserva) {
       return reservaCrudRepository.save(reserva);
    }

    @Override
    public void deleteReservaById(Integer id) {
        reservaCrudRepository.deleteById(id);
    }
    
}
