import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Character character;

    public Menu() {
        sc = new Scanner(System.in);
    }

    // Main function to run the menu
    public void run() {
        int choice;
        do {
            System.out.println("---- Main Menu ----");
            System.out.println("1. Create New Character");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createCharacter();
                    characterMenu(); // Once character is created, go to character menu
                    break;
                case 2:
                    System.out.println("Quitting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        } while (choice != 2);
    }

    // Method to create a new character
    private void createCharacter() {
        System.out.println("---- Character Creation ----");
        System.out.print("Enter the character's name: ");
        String name = sc.nextLine();

        System.out.println("Choose the role of your character:");
        System.out.println("1. Warrior (Guerrier)");
        System.out.println("2. Mage (Magicien)");
        int roleChoice = sc.nextInt();
        sc.nextLine(); // consume newline
        String role = (roleChoice == 1) ? "warrior" : "mage";

        // Create a new character with the given name and role
        character = new Character(name, role);
        System.out.println("Character created successfully!");
    }

    // Menu for interacting with the created character
    private void characterMenu() {
        int choice;
        do {
            System.out.println("---- Character Menu ----");
            System.out.println("1. Show Character Info");
            System.out.println("2. Modify Character Info");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Display character info
                    showCharacterInfo();
                    break;
                case 2:
                    // Modify character info
                    modifyCharacterInfo();
                    break;
                case 3:
                    // Return to main menu
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        } while (choice != 3);
    }

    // Method to display character info
    private void showCharacterInfo() {
        if (character != null) {
            System.out.println(character);
        } else {
            System.out.println("No character has been created yet.");
        }
    }

    // Method to modify character info
    private void modifyCharacterInfo() {
        if (character == null) {
            System.out.println("No character to modify.");
            return;
        }

        System.out.println("---- Modify Character Info ----");
        System.out.println("1. Modify Name");
        System.out.println("2. Modify Role");
        System.out.println("3. Back");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                // Modify the character's name
                System.out.print("Enter the new name: ");
                String newName = sc.nextLine();
                character.setName(newName);
                System.out.println("Name updated successfully.");
                break;
            case 2:
                // Modify the character's role
                System.out.println("Choose the new role:");
                System.out.println("1. Warrior (Guerrier)");
                System.out.println("2. Mage (Magicien)");
                int roleChoice = sc.nextInt();
                sc.nextLine(); // consume newline
                String newRole = (roleChoice == 1) ? "warrior" : "mage";
                character.setRole(newRole);
                System.out.println("Role updated successfully.");
                break;
            case 3:
                // Back to character menu
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();  // Start the game
    }
}

