package com.sda.iterator;

import java.util.Iterator;

public class App implements Iterable<String>{

    private String[] dataset = {"5", "2", "87", "4", "hello", "234" };

    public static void main(String[] args) {

//        SampleCollection sampleCollection = new SampleCollection();
//
//        while (sampleCollection.hasNext()){
//            System.out.println(sampleCollection.next());
//        }
        App app = new App();
        Iterator<String> iterator = app.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Override
    public Iterator<String> iterator() {
        return new SampleIterator(dataset);
    }
}
