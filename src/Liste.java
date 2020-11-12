public class Liste {
    private Knoten first;
    private Knoten last;

    //	remove first():Person
    //		Löscht das erste Element und das 2te wird zu dem ersten Element
    //		Das gelöschte Element wird zurückgegeben
    public Person removeFirst() {
        if (first != null) {
            Person tmp = first.getPerson();
            first = first.getNachfolger();
            first.setVorgaenger(null);
            return tmp;
        } else {
            return null;
        }
    }


    //	remove last():Person
    //		Löscht das Letzte Element und das vorletzte wird zum letzten
    //		Das gelöschte Element wird zurückgegeben
    public Person removeLast() {
        if (last != null) {
            Person tmp = last.getPerson();
            last = last.getVorgaenger();
            last.setNachfolger(null);
            return tmp;
        } else {
            return null;
        }
    }


    //	removeN(pN: int):Person
    //		löscht das Element an der gegebenen Stelle und gibt das gelöschte Element zurück
    public Person removeN(int pN) {

        return null;
    }


    //	removePerson(pPerson: Person):boolean
    //		Durchsucht die Liste nach der gegebenen Person und löscht diese.
    //		Bei erfolgreichem löschen wird true bei nicht erfolgreichem löschen durch z.B. Person nicht gefunden wird false zurückgegeben
    public boolean removePerson(Person pPerson) {
        return true;
    }


    //	add(pPerson: Person): void
    //		Fügt ein Element mit der gegebenen Person an der letzten Stelle hinzu
    public void add(Person pPerson) {

    }


    //	addN(pPerson: Person, pNumber: int): boolean
    //		Fügt ein Element mit der gegebenen Person and der gegebenen Stelle hinzu.
    //      Bei erfolgreichem hinzufügen wird true andernfalls false zurückgegeben
    public boolean addN(Person pPerson, int pN) {
        return true;
    }

}
