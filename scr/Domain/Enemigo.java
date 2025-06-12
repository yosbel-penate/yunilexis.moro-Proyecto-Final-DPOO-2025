package scr.Domain;

public class Enemigo {
    protected String nombre;
    protected String categoria;
    protected String apariencia;
    protected String estrategia;
    protected int vida;
    protected int ataqueBase;
    protected int defensa;

    public Enemigo(String nombre, String categoria, String apariencia, String estrategia, int vida, int ataqueBase, int defensa) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.apariencia = apariencia;
        this.estrategia = estrategia;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.defensa = defensa;
    }

    public void ataqueBasico() {
        System.out.println(nombre + " ataca con fuerza base de " + ataqueBase);
    }

    public void habilidadEspecial() {
        System.out.println(nombre + " utiliza su habilidad especial.");
    }
}
