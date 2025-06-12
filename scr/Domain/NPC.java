package scr.Domain;

class NPC {
    protected String nombre;
    public NPC(String nombre) {
        this.nombre = nombre;
    }
    public void hablar() {
        System.out.println(nombre + " dice: Hola.");
    }
    public void interactuar() {
        System.out.println("Interacción con " + nombre);
    }
}