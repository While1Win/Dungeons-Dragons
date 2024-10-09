import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character c = new Character();
        System.out.println("name?");
        String nom = sc.nextLine();
        c.setName(nom);
        System.out.println("1 for worrior 2 for mage");
        int type = sc.nextInt();
        c.setRole(c.roleChoice(type));
        OffensiveEquipement sword = new OffensiveEquipement("éclair","arm");
        DeffensiveEquipement shield = new DeffensiveEquipement("robe");
        c.AddWeapons(sword);
        System.out.println(shield.getName());
        c.addEquipement(shield);

        System.out.println(c);

        // Menu gameMenu = new Menu();
        // gameMenu.run();
    }
}
