
package gestiondeestudiante;

public class Estudiante {
    private String matricula;
    private String  nombre;
    private Double notaFinal;

    public Estudiante(String matricula, String nombre, Double notaFinal) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }
  public Boolean haAprobado(){
        return notaFinal>=4.0;
   }
   
}
