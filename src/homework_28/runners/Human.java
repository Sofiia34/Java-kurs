package homework_28.runners;

public class Human {

    private int runSpeed;
    private int restTime;

    protected String typeRunner = "Человек";

    public Human() {
        this(10, 15);

    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s бежит со скорость %d км/ч\n", typeRunner, runSpeed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужно %d минут отдыха\n",typeRunner, restTime);
    }

    @Override
    public String toString() {
        return "Human {" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }


}

