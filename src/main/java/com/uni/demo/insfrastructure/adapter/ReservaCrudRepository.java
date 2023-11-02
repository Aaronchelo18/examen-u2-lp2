/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uni.demo.insfrastructure.adapter;

import com.uni.demo.insfrastructure.entity.ReservaEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Aarón López
 */

public interface ReservaCrudRepository extends CrudRepository<ReservaEntity, Integer>{
    
}
