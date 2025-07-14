package valeriapagliarini.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import valeriapagliarini.u5d1.entities.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    //TOPPING

    @Bean
    public Topping mozzarellaExtra() {
        return new Topping("Mozzarella extra", 1.2, 100);
    }

    @Bean
    public Topping oliveNere() {
        return new Topping("Olive extra", 0.9, 50);

    }

    @Bean
    public Topping peperoni() {
        return new Topping("Peperoni", 1.5, 80);
    }

    @Bean
    public Topping granaPadano() {
        return new Topping("Grana Padano", 1.0, 90);
    }

    //PIZZE

    @Bean
    public Pizza capricciosa() {
        Capricciosa capricciosa = new Capricciosa(
                "Mozzarella", "Pomodoro", 8.0, 950.0,
                null, "Olive nere", "Funghi", "Carciofi", "Prosciutto"
        );
        capricciosa.addTopping(mozzarellaExtra());
        return capricciosa;
    }

    @Bean
    public Pizza parmigiana() {
        Parmigiana parmigiana = new Parmigiana(
                "Mozzarella", "Pomodoro", 7.5, 920.0,
                null, "Parmigiano", "Melanzane"
        );
        parmigiana.addTopping(oliveNere());
        return parmigiana;
    }
//menu

    // MENU

    @Bean
    public Menu menu() {
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(capricciosa());
        pizze.add(parmigiana());

        return new Menu(pizze);
    }
}


