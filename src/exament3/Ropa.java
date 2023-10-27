package exament3;

public class Ropa {
    private String Nombre;
    private double Precio;
    private int Stock;
    private Talla talla;
    private Genero genero;
    private int indiceTalla;
    private int indiceGenero;

    
    public Ropa() {}

    public Ropa(String Nombre, int Stock, double Precio) {
        this.Nombre = Nombre;
        this.Stock = Stock;
        this.Precio = Precio;
        
    }

    // Resto de tu clase Ropa...

    public int getIndiceTalla() {
        return indiceTalla;
    }

    public void setIndiceTalla(int indiceTalla) {
        this.indiceTalla = indiceTalla;
    }

    public int getIndiceGenero() {
        return indiceGenero;
    }

    public void setIndiceGenero(int indiceGenero) {
        this.indiceGenero = indiceGenero;
    }

    public String getTexto() {
        return "Nombre: " + this.Nombre + " | Stock: " + this.Stock+
                " | Precio:"+this.Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
