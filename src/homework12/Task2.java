package homework12;

public class Task2 {
    public static void main(String[] args) {
        byte[] maxTemperatures = {5, 7, 2, 13, 1, 2, 2};
        byte[] minTemperatures = {-2, 1, 2, 2, 2, 3, -4};
        byte totalMax = 0;
        byte totalMin = 0;
        for  (int a = 0; a < maxTemperatures.length; a++)  {
            totalMax += maxTemperatures[a];
            totalMin += minTemperatures[a];
        }
        int averageMax = totalMax / maxTemperatures.length;
        int averageMin = totalMin / minTemperatures.length;
        int averageTemperature = (averageMax + averageMin) / 2;
        System.out.println("Crednua temperatura sa nedely: " + averageTemperature);
    }
}
