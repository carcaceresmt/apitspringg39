/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.g39.appg39.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DELL
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="producto")
public class Producto implements Serializable {    
        @Id
        @GeneratedValue
        private int id;
        private String nombre;
        private double precio;
        private int inventario;     
    
    
}
