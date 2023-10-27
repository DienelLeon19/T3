package exament3;

public class Genero implements Generos 
{
    private String nombre;

    public Genero(String nombre) {
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
    public void editarGenero(String nuevoNombre) {
        setNombre(nuevoNombre);
    }
}

