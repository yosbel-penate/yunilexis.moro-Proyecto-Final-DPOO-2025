package scr.Domain;

public class Enemigo {
    protected String nombre;
    protected String categoria;
    protected String apariencia;
    protected String estrategia;
    public Enemigo(String nombre, String categoria, String apariencia, String
            estrategia) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.apariencia = apariencia;
        this.estrategia = estrategia;
    }
    public void ataqueBasico() {
        System.out.println(nombre + " realiza un ataque básico.");
    }
    public void habilidadEspecial() {
        System.out.println(nombre + " usa una habilidad especial.");
    }
}

