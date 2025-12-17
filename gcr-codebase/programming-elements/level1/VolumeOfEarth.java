public class VolumeOfEarth {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm;

        double radiusMile = radiusKm / 1.6;
        double volumeMile = (4.0 / 3) * pi * radiusMile * radiusMile * radiusMile;

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMile);
    }
}
