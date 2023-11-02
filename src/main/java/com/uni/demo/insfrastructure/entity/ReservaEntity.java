/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uni.demo.insfrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author Aarón López
 */

@Entity
@Table(name = "Reserva")
public class ReservaEntity {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Integer Id;
  private LocalDateTime fechaYhora;
  private Integer tiempoUso;
  private String responsable;
  @Enumerated(EnumType.STRING)
  private EstadoReserva estadoReserva;

    public ReservaEntity() {
    }

    public ReservaEntity(Integer Id, LocalDateTime fechaYhora, Integer tiempoUso, String responsable, EstadoReserva estadoReserva) {
        this.Id = Id;
        this.fechaYhora = fechaYhora;
        this.tiempoUso = tiempoUso;
        this.responsable = responsable;
        this.estadoReserva = estadoReserva;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public Integer getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(Integer tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
  
  
}