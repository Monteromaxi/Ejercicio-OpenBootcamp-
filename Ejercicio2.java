public class Ejercicio2 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.MasPuertas();
        System.out.println(miCoche.puertas);
    }

}

class Coche {
    public int puertas = 4;

    public void MasPuertas() {
        this.puertas++;
    }
}
