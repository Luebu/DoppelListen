public class Person {
    private int alter;
    private String name;

    Person(int pAlter, String pName){
        alter = pAlter;
        name = pName;
    }

    public int getAlter(){
        return alter;
    }
    public void setAlter(int pAlter){
        this.alter = pAlter;
    }

    public String getName(){
        return name;
    }
    public void setName(String pName){
        this.name = pName;
    }

    public String toString(){
        return "Name: " + name + " Alter: " + alter ;
    }
}
