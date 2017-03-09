package com.sdajava.Sortowanie;

public class QueueImpl {
    //Wartość którą wkładamy do kolejki
    private String value;

    private QueueImpl next;

    public QueueImpl(String value){
        this.value = value;
        this.next = null; // wartosc następnego elementu!!!
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueImpl getNext() {
        return next;
    }

    public void setNext(QueueImpl next) {
        this.next = next;
    }
}
