package max_sk.list;

import java.util.Iterator;

public class LinkedList<T> implements Iterable, Descending {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedList(){
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode );
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < size + 1;
            }
            @Override
            public T next() {
                return getElimentByIndex(count++);
            }
        };
    }

    @Override
    public Iterator descendingIterator() {
        return new Iterator() {
            int count = size;
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Object next() {
                return getElimentByIndex(count--);
            }
        };
    }


    public void addFirst(T data){
        Node<T> next = firstNode;
        next.setCurrentElement(data);
        firstNode = new Node<T>(null, null,next );
        next.setPrevElement(firstNode);
        size++;
    }

    public void addLast(T data){
        Node<T> pred = lastNode;
        pred.setCurrentElement(data);
        lastNode = new Node<T>(null, pred, null );
        pred.setNextElement(lastNode);
        size++;
    }


    public T getElimentByIndex(int index){
        Node<T> target = firstNode;
        for(int i = 0; i < index; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    public Node<T> getNextElement(Node<T> current){
        return current.getNextElement();
    }

    public void showAll(){
        Node<T> current = firstNode;
        if(firstNode.equals(null)){
            System.out.println("Список пуст");
            return;
        }
        while (current!=null){
            System.out.println(current.currentElement);
            current = current.getNextElement();
        }
    }

    private static class Node<T> {
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;

        public Node(T currentElement, Node<T> prevElement, Node<T> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.nextElement = nextElement;
        }


        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<T> prevElement) {
            this.prevElement = prevElement;
        }
    }





}


