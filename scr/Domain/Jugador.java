package scr.Domain;
import java.util.ArrayList;
public class Jugador {
    private String nombre;
    private int energiaTemporal;
    private ArrayList<PersonajeJugable> personajesActivos;
    private int maxReclutas = 4;
    private ArrayList<Item> inventario;
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.energiaTemporal = 100;
        this.personajesActivos = new ArrayList<>();
        this.inventario = new ArrayList<>();
    }
    public void usarItem(Item item, Object objetivo) {
        if (inventario.contains(item)) {
            item.usar(objetivo);
            inventario.remove(item);
        }
    }
    public void seleccionarPersonaje(PersonajeJugable personaje) {
        if (personajesActivos.size() < maxReclutas &&
                !personajesActivos.contains(personaje)) {
            personajesActivos.add(personaje);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public int getEnergiaTemporal() {
        return energiaTemporal;
    }
    public void setEnergiaTemporal(int energiaTemporal) {
        this.energiaTemporal = energiaTemporal;
    }
    public ArrayList<PersonajeJugable> getPersonajesActivos() {
        return personajesActivos;
    }
    public ArrayList<Item> getInventario() {
        return inventario;
    }
    public void agregarItemAlInventario(Item item) {
        inventario.add(item);
    }
}