package SampleObjets;

public class Carro implements Rueda,tanquear {

    public Carro(){

    }
    public void avanzar() {
        System.out.println("El Carro avanza");
    }


    public void detenerse() {
        System.out.println("El Carro se detiene ");
    }

    public void tanquear(){
        System.out.println("El carro listo para tanquear");
    }
}

