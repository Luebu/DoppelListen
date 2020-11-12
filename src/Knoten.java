public class Knoten {
    private Person person;
    private Knoten nachfolger;
    private Knoten vorgaenger;

    public void setNachfolger(Knoten n) {
        this.nachfolger = n;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setVorgaenger(Knoten vorgaenger) {
        this.vorgaenger = vorgaenger;
    }

    public Knoten getVorgaenger() {
        return vorgaenger;
    }

    public void setPerson(Person p) {
        this.person = p;
    }

    public Person getPerson() {
        return person;
    }
}
