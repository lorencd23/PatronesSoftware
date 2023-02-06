public class Main {
    public static void main(String[] args) {
        // Instanciar el objeto que será Observado
        UnObservado AvionLider = new UnObservado();
        // Instanciar y registrar un Observador
        UnObservador avionPerseguidor1 = new UnObservador("Maverick");
        AvionLider.agregarObservador(avionPerseguidor1);
        // Instanciar y registrar otro Observador
        UnObservador avionPerseguidor2 = new UnObservador("IceMan");
        AvionLider.agregarObservador(avionPerseguidor2);
        // Instanciar y registrar otro Observador
        UnObservador avionPerseguidor3 = new UnObservador("Falcon");
        AvionLider.agregarObservador(avionPerseguidor3);
        // Instanciar y registrar otro Observador
        UnObservador avionPerseguidor4 = new UnObservador("Greezly");
        AvionLider.agregarObservador(avionPerseguidor4);

        AvionLider.moverAbajo();
        AvionLider.moverArriba();
        AvionLider.moverDerecha();
        AvionLider.moverIzquierda();
    }
}



/*
 * Crear un avion lider (unObservado que extiende de Observado)
 * Avion perseguidores 4 (unObservador)
 * Clase abstracta que repita movimiento
 * Cuando al avion lider le den orden de moverse hacia un lado, el resto de aviones perseguidores le siguen
 */