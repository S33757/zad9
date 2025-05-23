import java.util.ArrayList;

public class Car implements Comparable<Car> {
    private String nazwaModelu;
    private int rok;

    public Car(String nazwaModelu, int rok) {
        this.nazwaModelu = nazwaModelu;
        this.rok = rok;
    }

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public int getRok() {
        return rok;
    }



    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.rok, car.rok);
    }

    @Override
    public String toString() {
        return nazwaModelu + " " + rok;
    }
}
