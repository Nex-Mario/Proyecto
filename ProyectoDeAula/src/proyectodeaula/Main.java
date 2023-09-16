/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectodeaula;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conductor a = new Conductor("Manuelillo Lopez",0001,31,"Ford Escape");
        Conductor b = new Conductor("Brayan Carrillo",0002,27,"Ram 1500");
        Conductor c = new Conductor("Dominica Castillo",0003,34,"GMC Sierra");
        Conductor d = new Conductor("Neftali Levito",0004,35,"Montero Sport");
        Conductor e = new Conductor("Alma Marcela Gozo",0005,32,"Scania Volvo");
        
        System.out.println("    Conductor Elegido   "+e.getConductor());
    }
    
}
