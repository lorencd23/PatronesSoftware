public class UnObservador implements IObservador {
    private String nombre;
    private String orden;

    // ---------------------------------

    public UnObservador(String nombre) {
        this.setNombre(nombre);
        System.out.println("Observador [" + this.nombre + "] creado");
    }

    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }
    
    public String getOrden() {
        return this.orden;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setOrden(String orden) {
        this.orden = orden;
    }

    // ---------------------------------

    @Override
    public void observadoActualizado(String orden) {
        this.setOrden(orden);
        System.out.println("Observador [" + this.getNombre() + "] recibe la orden y " + this.getOrden());
    }
}