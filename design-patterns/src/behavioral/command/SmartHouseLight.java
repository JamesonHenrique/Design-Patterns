package behavioral.command;

public class SmartHouseLight {
    private boolean isOn = false;
    private int intensity = 50;
    private String name;

    public SmartHouseLight(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    boolean turnOn() {
        this.isOn = true;
        System.out.println(name + " agora está " + getPowerStatus());
        return isOn;
    }

    boolean turnOff() {
        this.isOn = false;
        System.out.println(name + " agora está " + getPowerStatus());
        return isOn;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public void decreaseIntensity() {
        if (this.intensity > 0) {
            this.intensity--;
        }
    }

    public void increaseIntensity() {

        if (this.intensity < 100) {
            this.intensity++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowerStatus() {
        return isOn ? "Ligada" : "Desligada";
    }

}
