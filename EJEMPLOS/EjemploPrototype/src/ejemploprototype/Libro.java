/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploprototype;

/**
 *
 * @author darwi
 */
public class Libro implements Prototype{
    private String titulo;
    private String autor;
    boolean toString;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    

    @Override
    public Prototype clone() {
        return new Libro(titulo, autor);
    }
    
    
    @Override
    public String toString(){
     return titulo + " - " + autor;   
    }
    
    
}
