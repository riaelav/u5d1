package valeriapagliarini.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Parmigiana extends Pizza {

    private String melanzane;
    private String parmigiano;

    public Parmigiana(String mozzarella, String tomato, double price, double calories,
                      List<Topping> extraTopping, String parmigiano, String melanzane) {
        super("Pizza Parmigiana", mozzarella, tomato, price, calories, extraTopping);
        this.parmigiano = parmigiano;
        this.melanzane = melanzane;
    }

    @Override
    public String toString() {
        return "Parmigiana{" +
                "melanzane='" + melanzane + '\'' +
                ", parmigiano='" + parmigiano + '\'' +
                ", baseCalories=" + baseCalories +
                ", basePrice=" + basePrice +
                ", tomato='" + tomato + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                '}';
    }
}
