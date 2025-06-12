package scr.Domain;

import java.util.ArrayList;

public class Mapa {
    private String nombre;
    private String descripcion;
    private ArrayList<Escenario> escenarios;
    public Mapa(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.escenarios = new ArrayList<>();
    }
    public void agregarEscenario(Escenario escenario) {
        escenarios.add(escenario);
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public ArrayList<Escenario> getEscenarios() {
        return escenarios;
    }
}