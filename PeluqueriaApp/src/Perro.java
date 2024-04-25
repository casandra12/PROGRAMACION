public class Perro {
    String nombre;
    Boolean pelo;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Boolean getPelo() {
        return pelo;
    }
    
    public void setPelo(Boolean pelo) {
        this.pelo = pelo;
    }
    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", peludo=" + pelo + '}';
    }
}
