package carDesing;

import java.util.Optional;

public class EngineStyle {
    
    private final String type;
    private double volume;
    
    public EngineStyle(String type) {
        this.type = type;
    }

    public Optional<Double> paymentAmount() {
        if ("gasoline".equals(type)) { 
            this.volume = 1.6;
            return Optional.of(101.1);
        } else if ("diesel".equals(type)) {
            this.volume = 1.3;
            return Optional.of(111.1);
        } else {
            return Optional.empty();
        }
    }
    
    public double getVolume() {
        return volume;
    }
}