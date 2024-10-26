/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplobuilder2;

/**
 *
 * @author darwi
 */
public class Builder {
    public String puerta;
    public String tipo;
    public String color;
    public boolean aireAcondicionado;
    public boolean navegacionCrucero;

    public Builder setPuerta(String puerta) {
        this.puerta = puerta;
        return this;
    }

    public Builder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public Builder setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
        return this;
    }

    public Builder setNavegacionCrucero(boolean navegacionCrucero) {
        this.navegacionCrucero = navegacionCrucero;
        return this;
    }
    
    public Vehiculo build(){
        return new Vehiculo(this);
    }
    
    
}
