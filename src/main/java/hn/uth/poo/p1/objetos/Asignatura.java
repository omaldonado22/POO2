/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.objetos;

/**
 *
 * @author DELL
 */
public class Asignatura {
    private String codigo;
    private String Nombre;
    private Nivel Nivel;

    public Asignatura(String codigo, String Nombre, Nivel Nivel) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
    }

    public Asignatura() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Nivel getNivel() {
        return Nivel;
    }

    public void setNivel(Nivel Nivel) {
        this.Nivel = Nivel;
    }
    
}
