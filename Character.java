public class Character {
    //Defining class properties
    private String name;
    private String role;
    private int healthPoints;
    private int attack;
    private OffensiveEquipement weapon;
    private DeffensiveEquipement equipement;
    

    // Defining constrctors

    //First Constructor,
    public Character(){
        this("Adventurer");
    }

    //Second Constructor
    public Character (String name){
        this(name,"");
    }

    //Third Constructor
    public Character (String name, String role){
        this.name = name;
        setRole(role);
    }

    
    //Defining Getters
    public String getName(){return name;}
    public String getRole(){return role;}
    public int getHealthPoints(){return healthPoints;}
    public int getAttack(){return attack;}
    public OffensiveEquipement getWeapon (){return weapon;}
    public DeffensiveEquipement getEquipement (){return equipement;}

    //Defining Setters
    public void setRole(String role){
        this.role = role;
        this.healthPoints = (role.equalsIgnoreCase("Warrior") ? 10:6);
        this.attack = (role.equalsIgnoreCase("Warrior") ? 10:15);
    }

    public void setName(String name){
        this.name = name;
    }

    //Method to determine character's role
    public String roleChoice(int choice){
        return (choice == 1) ? "Warrior":"mage";
    }

        // Method to add a weapon
    public void AddWeapons (OffensiveEquipement weapons){
        if ((this.role.equalsIgnoreCase("Warrior") && weapons.getType().equalsIgnoreCase("Arm")) ||
        (this.role.equalsIgnoreCase("mage") && weapons.getType().equalsIgnoreCase("spell"))){
            this.weapon = weapons;
            this.attack = this.attack + weapons.getDamage();

        }
    }

    // Method to add an equipement
    public void addEquipement (DeffensiveEquipement equipement){
        if ( (this.role.equalsIgnoreCase("Warrior") && equipement.getName().equalsIgnoreCase("shield") ) ||
        (this.role.equalsIgnoreCase("mage") && equipement.getName().equalsIgnoreCase("robe"))){
            this.equipement = equipement;
        }
    }

    // toString method
    public String toString (){
        return "Name : " + name + "\nRole: " + role + "\nHP : " + healthPoints + "\nAttack: " + attack+
        (weapon != null ? "\nWeapon: " + weapon.getName() : "\nPas d'arme équipée")+ 
        (equipement != null ? "\nEquipements: " + equipement.getName() : "\nNo Equipements");
    }

}