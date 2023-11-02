/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uni.demo.insfrastructure.configuration;

import com.uni.demo.app.repository.ReservaRepository;
import com.uni.demo.app.service.ReservaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Aarón López
 */

@Configuration
public class BeanConfiguration {
    
    @Bean
    public ReservaService reservaService(ReservaRepository reservaRepository){
        return new ReservaService(reservaRepository);
    }
}