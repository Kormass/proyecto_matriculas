package proyecto.proyecto.repository.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class periodo {
    private int id;
    private int codigo;
    private Date ano;
    private int semestre;

    
    public periodo(int id, int codigo, Date ano, int semestre) {
        this.id = id;
        this.codigo = codigo;
        this.ano = ano;
        this.semestre = semestre;
    }
    
    
    public void imprimir() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("ID: " + id);
        System.out.println("Código: " + codigo);
        System.out.println("Año: " + dateFormat.format(ano));
        System.out.println("Semestre: " + semestre);
    }
}
