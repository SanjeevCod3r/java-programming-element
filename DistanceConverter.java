public class DistanceConverter {
    public static void main(String[] args) {
        // Given distance in kilometers
        double distanceKilometers = 10.8;
        
        // Conversion factor: 1 km = 1.6 miles
        double conversionFactor = 1.6;
        
        // Convert the distance to miles
        double distanceMiles = distanceKilometers * conversionFactor;

        // Output the result
        System.out.println("The distance " + distanceKilometers + " km in miles is " + distanceMiles);
    }
}
