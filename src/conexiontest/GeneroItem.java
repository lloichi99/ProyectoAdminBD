/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiontest;

/**
 *
 * @author joyce
 */
public class GeneroItem {
    private int idGenero;
    private String descripcion;

    public GeneroItem(int idGenero, String descripcion) {
        this.idGenero = idGenero;
        this.descripcion = descripcion;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion; // Esto determina qué se mostrará en el JComboBox
    }
}
