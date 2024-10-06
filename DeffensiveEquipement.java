public class DeffensiveEquipement {

    //Defining Class Properties
    private String name;

    //Defining Constructor
    public DeffensiveEquipement (String name){
        setName(name);
    }

    //Defining Getter
    public String getName(){return name;}

    //Defining Setter
    public void setName (String name){
        this.name = (name.equalsIgnoreCase("shield") || name.equalsIgnoreCase("robe") ? name:null);
    }

    //toString method
    public String toString(){
        return "Equipement: "+name;
    }
}