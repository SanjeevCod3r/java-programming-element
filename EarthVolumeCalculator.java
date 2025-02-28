public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Given radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Constant for pi
        double pi = Math.PI;

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert the volume from cubic kilometers to cubic miles
        double volumeMiles3 = volumeKm3 * 0.239913;

        // Output the result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
