package com.sdajava.Sortowanie;

public class QueueElements {

    private QueueImpl first;

    private QueueImpl last;

    public QueueElements(){
        first = last = null;
    }

    public  QueueImpl getLast(){
       return   last;
    }

    public void add(String value){

        QueueImpl queue = new QueueImpl(value);

        if(first == null){

            first = last = queue;
        }else{

            last.setNext(queue);
            last = queue;
        }

    }

    public void show(){

        if(first != null){
            QueueImpl element = first;

            while(element != null){

                System.out.println(element.getValue());
                element = element.getNext();
            }
        }
    }

}
