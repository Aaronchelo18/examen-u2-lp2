/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uni.demo.app.repository;

import com.uni.demo.insfrastructure.entity.ReservaEntity;
import java.util.Optional;

/**
 *
 * @author Aarón López
 */

public interface ReservaRepository{
    Iterable<ReservaEntity> getReserva();
    Optional<ReservaEntity> getReservaById(Integer reservaId);
    ReservaEntity saveReserva(ReservaEntity reserva);
    void deleteReservaById(Integer id);
}
