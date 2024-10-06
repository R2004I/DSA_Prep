package org.example;

public class DieselEngine implements IEngine{

    public DieselEngine() {
        System.out.println("Diesel engine constructor..");
    }

    @Override
    public int start() {
        System.out.println("Diesel engine started....");
        return 1;
    }
}
