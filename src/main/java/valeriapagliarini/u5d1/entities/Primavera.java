package valeriapagliarini.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Primavera extends Pizza {

    private String rucola;
    private String grana;

    public Primavera(String mozzarella, String tomato, double price, double calories,
                     List<Topping> extraTopping, String rucola, String grana) {
        super("Pizza Primavera", mozzarella, tomato, price, calories, extraTopping);
        this.rucola = rucola;
        this.grana = grana;
    }

    @Override
    public String toString() {
        return "Primavera{" +
                "rucola='" + rucola + '\'' +
                ", grana='" + grana + '\'' +
                ", baseCalories=" + baseCalories +
                ", basePrice=" + basePrice +
                ", tomato='" + tomato + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                '}';
    }
}
