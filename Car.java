import java.util.ArrayList;

public class Car implements Comparable<Car> {
    public String nazwaModelu;
    public int rok;

    public Car(String nazwaModelu, int rok) {
        this.nazwaModelu = nazwaModelu;
        this.rok = rok;
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
