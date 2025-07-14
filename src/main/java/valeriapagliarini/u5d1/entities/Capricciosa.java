package valeriapagliarini.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Capricciosa extends Pizza {

    private String ham;
    private String carciofi;
    private String funghi;
    private String olive;

    public Capricciosa(String mozzarella, String tomato, double price, double calories,
                       List<Topping> extraTopping, String olive, String funghi, String carciofi, String ham) {
        super("Pizza Capricciosa", mozzarella, tomato, price, calories, extraTopping);
        this.olive = olive;
        this.funghi = funghi;
        this.carciofi = carciofi;
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Capricciosa{" +
                "ham='" + ham + '\'' +
                ", carciofi='" + carciofi + '\'' +
                ", funghi='" + funghi + '\'' +
                ", olive='" + olive + '\'' +
                ", baseCalories=" + baseCalories +
                ", basePrice=" + basePrice +
                ", tomato='" + tomato + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                '}';
    }
}
