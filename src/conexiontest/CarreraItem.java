/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiontest;

/**
 *
 * @author joyce
 */
public class CarreraItem {
        private int idCarrera;
        private String nombre;
        
        public CarreraItem(int idCarrera, String nombre){
            this.idCarrera = idCarrera;
            this.nombre = nombre;
        }
        
        public int getIdCarrera(){
            return idCarrera;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        @Override
        public String toString(){
            return nombre; //Esto detrmina que se mostraraen el JComboBox
        }
}
