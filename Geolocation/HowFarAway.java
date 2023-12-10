package Geolocation;
import java.util.Scanner;

public class HowFarAway {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location: ");
        double lat1 = input.nextDouble();

        System.out.println("Enter the longitude of the starting location: ");
        double long1 = input.nextDouble();

        System.out.println("Enter the latitude of the ending location: ");
        double lat2 = input.nextDouble();

        System.out.println("Enter the longitude of the ending location: ");
        double long2 = input.nextDouble();

        input.close();

        GeoLocation no1 = new GeoLocation(lat1, long1);
        GeoLocation no2 = new GeoLocation(lat2, long2);

        double distance = no1.distanceFrom(no2);

        System.out.println("The distance is " + distance + " miles.");


    }
    
}
