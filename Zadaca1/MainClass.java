import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        Avtomobil avtomobil = new Avtomobil("Chevrolet", "Corvette Stingray", "Portokleva", 1543, 2022, "BT-869-AF");

        avtomobil.pecatenje();
        System.out.println(avtomobil.presmetkaKilometri());
    }
}
