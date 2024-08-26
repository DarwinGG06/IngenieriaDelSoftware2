/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.srp;

/**
 *
 * @author darwi
 */
public class Taller1SRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Darwin","darwin.gonzalezg@gmail.com","dar123",40);

        InformacionUsuario informacionUsuario = new InformacionUsuario();
        informacionUsuario.obtenerInformacion(usuario);


        ServicioCorreo enviarCorreo = new ServicioCorreo();
        enviarCorreo.enviarCorreo(usuario);

        ServicioSalario calcularSalario = new ServicioSalario();
        double salario = calcularSalario.calcularSalario(usuario, 4500);
        System.out.println("Salario: " + salario);

        ValidarContrasena contrasenaValida = new ValidarContrasena();
        boolean contrasena = contrasenaValida.validarContrasena(usuario, "dar1234");

        if(contrasena){
            System.out.println("Contrasena valida");
        }else{
            System.out.println("Contrasena invalida");
        }

    }
    
}
