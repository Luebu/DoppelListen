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
        Knoten tmp = first;
        if(pN==1){
            first=first.getNachfolger();
            first.setVorgaenger(null);
        }
        for (int i = 0; i < pN-1; i++) {
            if (tmp.getNachfolger() == null) {
                return null;
            }
            tmp = tmp.getNachfolger();
        }
        if (tmp != last) {
            tmp.getNachfolger().setVorgaenger(tmp.getVorgaenger());
        }
        if (tmp != first) {
            tmp.getVorgaenger().setNachfolger(tmp.getNachfolger());
        }
        return tmp.getPerson();
    }


    //	removePerson(pPerson: Person):boolean
    //		Durchsucht die Liste nach der gegebenen Person und löscht diese.
    //		Bei erfolgreichem löschen wird true bei nicht erfolgreichem löschen durch z.B. Person nicht gefunden wird false zurückgegeben
    public boolean removePerson(Person pPerson) {
        Knoten tmp = first;
        if(tmp.getPerson()==pPerson){
            first=first.getNachfolger();
            first.setVorgaenger(null);
            return true;
        }
        while (tmp.getPerson() != pPerson) {
            if (tmp.getNachfolger() == null) {
                return false;
            }
            tmp = tmp.getNachfolger();
        }
        if (tmp != last) {
            tmp.getNachfolger().setVorgaenger(tmp.getVorgaenger());
        }
        if (tmp != first) {
            tmp.getVorgaenger().setNachfolger(tmp.getNachfolger());
        }
        return true;
    }


    //	add(pPerson: Person): void
    //		Fügt ein Element mit der gegebenen Person an der letzten Stelle hinzu
    public void add(Person pPerson) {
        if (first == null) {
            first = new Knoten();
            first.setPerson(pPerson);
            last = first;
            return;
        }
        last.setNachfolger(new Knoten());
        last.getNachfolger().setVorgaenger(last);
        last = last.getNachfolger();
        last.setPerson(pPerson);

    }


    //	addN(pPerson: Person, pNumber: int): boolean
    //		Fügt ein Element mit der gegebenen Person and der gegebenen Stelle hinzu.
    //      Bei erfolgreichem hinzufügen wird true andernfalls false zurückgegeben
    public boolean addN(Person pPerson, int pN) {
        Knoten tmp = first;
        if (first != null) {
            if(pN==1) {
                Knoten nTemp=first;
                first=(new Knoten());
                first.setPerson(pPerson);
                first.setNachfolger(nTemp);
                first.getNachfolger().setVorgaenger(first);

            }
                for (int i = 2; i < pN; i++) {
                    if (tmp.getNachfolger() == null) {
                        return false;
                    }
                    tmp = tmp.getNachfolger();
                }

            Knoten nTemp = tmp.getNachfolger();
            tmp.setNachfolger(new Knoten());
            tmp.getNachfolger().setPerson(pPerson);
            tmp.getNachfolger().setVorgaenger(tmp);
            tmp.getNachfolger().setNachfolger(nTemp);
            tmp.getNachfolger().getNachfolger().setVorgaenger(tmp.getNachfolger());
        }

        return true;
    }

    public String toString() {
        String ret = "[";
        Knoten tmp = first;
        if (first == null) {
            return ret + "]";
        }
        int count = 0;
        ret = ret + "(0) " + tmp.getPerson();
        while (tmp.getNachfolger() != null) {
            tmp = tmp.getNachfolger();
            ret = ret + " ; (" + ++count + ") " + tmp.getPerson();
        }
        ret = ret + "]";
        return ret;
    }
}
