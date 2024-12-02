/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta4;

/**
 *
 * @author darwi
 */
public class Configuracion {
    private static Configuracion inst;
    
    private String url;
    private String usuario;
    private String password;

    public Configuracion() {
        this.url = "uahsdiuasgidgasiud";
        this.usuario = "darwinshow";
        this.password = "abc123";
    }
    
    public static Configuracion getInst(){
        if(inst == null){
            inst = new Configuracion();   
        }
        return inst;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
}
