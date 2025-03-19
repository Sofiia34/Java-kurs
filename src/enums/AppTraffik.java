package enums;

public class AppTraffik {
    public static void main(String[] args) {
        Colors colors = Colors.RED;
        System.out.println("colors + " + colors);
        Colors[] red = Colors.values();
        for (Colors current : Colors.values()){
            System.out.println(current);
        }
        Colors red1 = Colors.valueOf("RED");
        System.out.println("colors == Colors.RED: " + (colors == Colors.RED));
        System.out.println("colors.ordinal(); " + colors.ordinal());
        TrafficLight trafficLight =
                new TrafficLight("SN-001", "Berlin", Colors.YELLOW);
        System.out.println(trafficLight);
    }
}
