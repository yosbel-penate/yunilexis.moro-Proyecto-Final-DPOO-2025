package scr.Domain;
public abstract class Item {
    protected String nombre;
    protected String tipo;

    public Item(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public abstract void usar(Object objetivo);

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}