/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta2;

/**
 *
 * @author darwi
 */
public class Builder {
    public String tipoTomate;
    public String tipoCarne;
    public String tipoQueso;
    public String tipoPan;    

    public Builder setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
        return this;
    }

    public Builder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    public Builder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public Builder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    }
    public Hamburguesa build(){
        return new Hamburguesa(this);
    }
    
    
}
