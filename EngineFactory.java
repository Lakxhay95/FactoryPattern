package com.genie.springdemo.loosecouple;

public class EngineFactory {
    public IEnginer getInstance(String engineName) {
        if(engineName.equals("Petrol")) {
            return new PetrolEngine();
        } else {
            return new DieselEngine();
        }
    }
}
