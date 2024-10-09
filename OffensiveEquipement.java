
public abstract class OffensiveEquipement {
    //Defining Class properties
    protected String name;
    protected String type;
    protected int damage;

    //Defining Constructors
    public OffensiveEquipement(String name, String type){
        setName(name);
        this.damage = setDamage(name);
        setType(type);
        
    }
    //Defining Getters
    public String getName (){return name;}
    public String getType (){return type;}
    public int getDamage (){return damage;}

    //Defining Setters
    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = (getName().equalsIgnoreCase("epee") || getName().equalsIgnoreCase("massue")) ? "Arm":"spell";
    }

    public int setDamage (String name){
        switch (name){
            case "massue":
                return 3;
            case "epee":
                return 5;
            case "éclair":
                return 2;
            case "boule de feu":
                return 7;
            default:
                return 0;
        }
    }

    //toString method
    public String toString (){
        return "Your Weapon: " + name + "\n Type:" + type + "\nDamage: " + damage;
    }

}
