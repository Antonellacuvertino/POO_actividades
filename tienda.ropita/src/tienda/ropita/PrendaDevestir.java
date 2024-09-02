/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.ropita;

/**
 *
 * @author W610-PCXX
 */
public class PrendaDevestir {
    //atributos
    private String codigo;
    private String nombre;
    private String categoria;
    private String marca;
    private Boolean disponibilidad;
    
    //Constructor

    public PrendaDevestir(String codigo, String nombre, String categoria, String marca, Boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.disponibilidad = disponibilidad;
    }
    
    //Metodos
    
    public void vender(){
        if (disponibilidad){
            
        
        disponibilidad=false; 
        System.out.println("prenda vendida: " + nombre);
        }else{
            System.out.println("la prenda no esta disponible para la venta:" + nombre);
        }
    }
    
    //metodo para reponer una prenda 
    public void reponerInventario(){
        if (disponibilidad==false){
            disponibilidad=true;
            System.out.println("L");
        } else {
            System.out.println("La prenda esta disponible:" + nombre);
        }
    } 
    //Metodo para obtener todos los datos de la prenda 
    public String getInfo(){
        return "Codigo: " + codigo + ", nombre: " + nombre + ", Categoria: "+ categoria + ", marca: " + marca + ", Disponibilidad: " + (disponibilidad? "Si esta disponible" : "No eta disponible"); 
    }
    
    
}
