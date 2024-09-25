/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.dry;

/**
 *
 * @author darwi
 */
public class Email {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public void validar() {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email Invalido");
        }
        else{
            System.out.println("Email Valido");
        }
    }

}
