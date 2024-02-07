package proyecto.proyecto.repository.models;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class persona {
    private int id;
    private String tipoDocumento;
    private int numeroDocumento;
    private String nombres;
    private String apellidos;
    private String ciudadResidencia;
    private String direccion;
    private int telefono;
    private Date fechaNacimiento;
    private String sexo;

    public persona(int id, String tipoDocumento, int numeroDocumento, String nombres, String apellidos, String ciudadResidencia, String direccion, int telefono, Date fechaNacimiento, String sexo) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudadResidencia = ciudadResidencia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

   public String getFullName(){
        return this.nombres+" "+this.apellidos;

    }
   
   public void imprimir() {
        System.out.println("Documento: " + tipoDocumento + " " + numeroDocumento);
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Ciudad Residencia: " + ciudadResidencia);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Sexo: " + sexo);
    }

}