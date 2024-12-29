package facade;

import carDesing.BodyStyle;
import carDesing.EngineStyle;

public class FacadeCarBuild {


    public void cheaperCar() {
    	System.out.println("Cheaper Car desing is starting");
        buildCar("hatchback", "gasoline");
        
    }

    public void expensiveCar() {
    	System.out.println("Expensive Car desing is starting");
        buildCar("sedan", "diesel");
    }

    private void buildCar(String bodyType, String engineType) {
        BodyStyle bodyStyle = new BodyStyle(bodyType);
        EngineStyle engineStyle = new EngineStyle(engineType);
        System.out.println("TotalPayment : " + calculateTotalPayment(bodyStyle, engineStyle));
        getCarDetails(bodyType, engineType, bodyStyle, engineStyle);
    }
    
    private double calculateTotalPayment(BodyStyle bodyStyle, EngineStyle engineStyle) {
        return bodyStyle.paymentAmount().orElse(0.0) + engineStyle.paymentAmount().orElse(0.0);
    }

    private void getCarDetails(String bodyType, String engineType, BodyStyle bodyStyle, EngineStyle engineStyle) {        
        System.out.println(
        		String.format("Body: %s, Color: %s, Engine: %s, Volume: %.1f", 
        	            bodyType, bodyStyle.getColor(), engineType, engineStyle.getVolume())
        		);        
    }
    
    
}
