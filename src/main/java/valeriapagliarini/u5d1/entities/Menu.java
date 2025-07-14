package valeriapagliarini.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Menu {
    public List<Pizza> pizze;


    public void printMenu() {
        System.out.println(" MENU DELLA PIZZERIA:");
        for (Pizza p : pizze) {
            System.out.println("----------------------------");
            p.printPizza();
        }
        System.out.println("----------------------------");
    }
}





