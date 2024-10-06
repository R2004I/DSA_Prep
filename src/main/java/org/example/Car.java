package org.example;

public class Car {

    IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public Car() {
        System.out.println("Calling car constructor..");
    }

    public void setEngine(IEngine engine) {
        System.out.println("Calling setter method..");
        this.engine = engine;
    }

    public void drive(){
        int start = engine.start();
        if(start>=1){
            System.out.println("Car has started.");
        }
        else{
            System.out.println("Engine in trouble.");
        }
    }
}
