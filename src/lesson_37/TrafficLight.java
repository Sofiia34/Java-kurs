package enums;

public class TrafficLight {
    private String seriaNumber;
    private String lokation;

    private String light;
    public TrafficLight(String seriaNumber, String lokation, Colors Light) {
        this.seriaNumber = seriaNumber;
        this.lokation = lokation;
        this.light = light;
    }
    @Override
    public String toString() {
        return  "TraffikLight{" +
                "seriaNumber=' " + seriaNumber + '\'' +
                ", location='" + lokation + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}