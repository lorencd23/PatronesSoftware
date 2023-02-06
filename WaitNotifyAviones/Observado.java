import java.util.ArrayList;

public abstract class Observado {
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    private String movimiento; 
    // ---------------------------------

    public Observado() {
    }

    // ---------------------------------

    public void agregarObservador(IObservador o) {
        observadores.add(o);
        // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los
        // existentes serán notificados
    }

    // ---------------------------------

    public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }

    // ---------------------------------

    public void setMovimiento(String movimiento){
        this.movimiento = movimiento;
    }

    public void moverDerecha(){
        System.out.println("El avion lider se mueve a la derecha");
        this.movimiento = "se mueve a la derecha";
        notificarObservadores();
    }
    public void moverIzquierda(){
        System.out.println("El avion lider se mueve a la izquierda");
        this.movimiento = "se mueve a la izquierda";
        notificarObservadores();
    }
    public void moverArriba(){
        System.out.println("El avion lider asciende");
        this.movimiento = "asciende";
        notificarObservadores();
    }
    public void moverAbajo(){
        System.out.println("El avion lider desciende");
        this.movimiento = "desciende";
        notificarObservadores();
    }

    // ---------------------------------

    public void notificarObservadores() {
        // Enviar la notificación a cada observador a través de su propio método
        for (IObservador obj : observadores) {
            obj.observadoActualizado(movimiento);
        }
    }
}