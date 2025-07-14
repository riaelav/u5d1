package valeriapagliarini.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Pizza {

    protected final String name;  // Nome della pizza
    protected String mozzarella;
    protected String tomato;
    protected double basePrice;
    protected double baseCalories;
    protected List<Topping> extraTopping = new ArrayList<>();

    public Pizza(String name, String mozzarella, String tomato,
                 double basePrice, double baseCalories, List<Topping> extraTopping) {
        this.name = name;
        this.mozzarella = mozzarella;
        this.tomato = tomato;
        this.basePrice = basePrice;
        this.baseCalories = baseCalories;
        this.extraTopping = extraTopping != null ? extraTopping : new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        extraTopping.add(topping);
        System.out.println("Aggiunto topping: " + topping.getName());
    }

    public double getTotalPrice() {
        return basePrice + extraTopping.stream().mapToDouble(Topping::getPrice).sum();
    }

    public double getTotalCalories() {
        return baseCalories + extraTopping.stream().mapToDouble(Topping::getCalories).sum();
    }

    public void printPizza() {
        System.out.println("Pizza" + name);
        System.out.println("  Ingredienti base: " + tomato + ", " + mozzarella);
        System.out.println("  Prezzo base: €" + basePrice);
        System.out.println("  Calorie base: " + baseCalories + " kcal");

        if (extraTopping.isEmpty()) {
            System.out.println("  Nessun topping extra.");
        } else {
            System.out.println("  Topping extra:");
            for (Topping t : extraTopping) {
                System.out.println("   - " + t.getName() + " (€" + t.getPrice() + ", " + t.getCalories() + " kcal)");
            }
        }

        System.out.println("  Totale: €" + getTotalPrice() + " | " + getTotalCalories() + " kcal");
    }
}
