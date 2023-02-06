public class Buffer {
    // Mensaje de tipo cadena que comparten los hilos 
    private String packet;

    private boolean puedoRecibir = false;
    private boolean puedoEnviar = true;

    public synchronized void sender(String packet){
        while(!puedoEnviar && puedoRecibir){
            try {
                wait(); //ALGUIEN ESTA RECIBIENDO EL MENSAJE
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //EN CASO DE QUE PUEDA ENVIAR
        puedoEnviar = false;
        puedoRecibir = true;

        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive(){
        while(!puedoRecibir && puedoEnviar){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        puedoEnviar = true;
        puedoRecibir = false;

        String returnPacket = this.packet;
        notifyAll();
        return returnPacket;
    }
}
