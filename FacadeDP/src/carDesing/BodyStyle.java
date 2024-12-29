package carDesing;

import java.util.Optional;

public class BodyStyle {
    
    private final String type;
    private String color;
    
    public BodyStyle(String type) {
        this.type = type;
    }

    public Optional<Double> paymentAmount() {
        if ("sedan".equals(type)) { 
            this.color = "white"; 
            return Optional.of(81.1);
        } else if ("hatchback".equals(type)) {
            this.color = "black"; 
            return Optional.of(71.9);
        } else {
            return Optional.empty();
        }
    }

    public String getColor() {
        return this.color;
    }
}
