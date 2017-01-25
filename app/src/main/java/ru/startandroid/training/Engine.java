package ru.startandroid.training;


public class Engine {
    private String modelEngine;

    public Engine() {
    }

    protected void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    protected String getNameEngine(){
        return modelEngine;
    }
}
