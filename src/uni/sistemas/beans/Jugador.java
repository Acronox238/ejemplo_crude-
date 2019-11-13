
package uni.sistemas.beans;

public class Jugador {
    // atributos
    private int id;
    private String nombre;
    private String puesto;
   // constructor

    public Jugador() {
    }

    public Jugador(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }
    // metodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return  id + "----" + nombre + "----" + puesto;
    }
    
}
