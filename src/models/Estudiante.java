package models;

public class Estudiante {
    private String name;
    private double nota;
    //Constructor Lleno
    public Estudiante(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }
    //Constructor Vacio, puede haber sobrecarga de constructores, es decir, 
    // puede haber varios constructores con diferentes parametros
    public Estudiante() {
    }                   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    @Override 
    public String toString(){
        return "[El nombre del estudiante es: " + name + "| la nota del estudiante es: " + nota + "]";
    }
    
}
