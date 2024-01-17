package TestB.TestB_Q5.src.main.java.com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


public class ShippingController {

    @PostMapping("/calculateShippingFee")
    public ResponseEntity<?> calculateShippingFee(@RequestBody List<ShippingRequest> shippingRequests) {
        double totalShippingFee = 0.0;

        for (ShippingRequest request : shippingRequests) {
            double volumetricWeight = calculateVolumetricWeight(request);
            double chargeableWeight = Math.max(volumetricWeight, request.getWeight());
            double cost = determineCost(chargeableWeight, request.getTemperatureCondition());
            totalShippingFee += cost * request.getQuantity();
        }

        return ResponseEntity.ok("Total Shipping Fee: " + totalShippingFee);
    }

    private double calculateVolumetricWeight(ShippingRequest request) {
        return (request.getLength() * request.getWidth() * request.getHeight()) / 5000;
    }

    private double determineCost(double weight, String temperatureCondition) {
        // Implement rate card logic here
        // For simplicity, let's assume a flat rate based on the provided example
        if ("Chill".equals(temperatureCondition)) {
            return weight > 5 ? 30 : 20;
        }
        // Add logic for other temperature conditions if needed
        return 0;
    }
}