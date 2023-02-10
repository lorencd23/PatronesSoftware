
package threads01;

import threads01.factory.FactoryThreads;

/**
 * @author LorenzoGalveMuñoz
 */

//Herencia simple
public class Threads01 extends Thread{//extends solo se puede heredar de una clase

    public Threads01(String threadName){
        super(threadName); 
    }
    
    //UN PLAY

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + super.getName());
            System.out.println("Termina Thread " + super.getName());
        }
    }
    
    
    
    
    public static void main(String[] args) {
        //ACTIVAR SEMAFORO
//      new Threads01("COMANDANTE").start();
//      new Threads01("CENTURION").start();
//      new Threads01("SOLDADO").start();
//      System.out.println("Termina Programacion Threads(). ");

        FactoryThreads.getInstance(FactoryThreads.COMANDANTE).start();
        FactoryThreads.getInstance(FactoryThreads.CENTURION).start();
        FactoryThreads.getInstance(FactoryThreads.SOLDADO).start();

//        new Thread (new SoldierRunnable(), "COMANDANTE").start();
//        new Thread (new SoldierRunnable(), "CENTURION").start();
        System.out.println("Termina Programacion Threads(). ");
    }
    
}
