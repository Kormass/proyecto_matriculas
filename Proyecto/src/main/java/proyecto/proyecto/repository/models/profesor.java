/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecto.repository.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class profesor {
    private int id;
    private persona persona;
    private departamento departamento;

    public void imprimir() {
        System.out.println("ID: " + id);
        persona.imprimir();
        departamento.imprimir();
    }
}

