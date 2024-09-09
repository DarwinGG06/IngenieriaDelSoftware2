/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.dip;

import java.util.Date;

/**
 *
 * @author darwi
 */
public class Orden {
    private Date fecha;
    private String lugarOrigen;
    private String lugarDestino;

    public Orden(Date fecha, String lugarOrigen, String lugarDestino) {
        this.fecha = fecha;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }
    
    
    
}
