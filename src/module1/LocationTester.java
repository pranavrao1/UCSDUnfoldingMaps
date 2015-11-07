package module1;

/**
 * Created with IntelliJ IDEA.
 * User: Pranav
 * Date: 10/4/15
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class LocationTester {
    public static void main(String[] args){
        /**
        SimpleLocation location1 = new SimpleLocation(39.9,116.4);
        SimpleLocation location2 = new SimpleLocation(55.8,37.6);
        location1 = location2;
        location1.lat = -8.3;
        System.out.println(location2.lat + ", " + location2.lon);
        **/
        double lat = -15.5;
        SimpleLocation lime = new SimpleLocation(lat,-77);
        lat = -12.0;
        System.out.print(lime.lat);
     }
}
