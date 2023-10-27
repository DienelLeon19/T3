package exament3;
public class Talla implements Tallas {
    private String nombre;

    public Talla(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    @Override
    public void editarTalla(String nuevoNombre) {
        setNombre(nuevoNombre);
    }
}
