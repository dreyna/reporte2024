/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ProfCisco
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporte {
    private int idreporte;
    private String escuela;
    private int cantidad;
}
