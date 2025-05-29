package structural.bridge;

public class TV implements DeviceImplementation{
    private int volume = 10;
    private boolean power = false;

    @Override
    public String getName() {
        return "TV";
    }

    @Override
    public void setPower(boolean powerStatus) {
        power = powerStatus;
    }

    @Override
    public boolean getPower() {
        return power;
    }

    @Override
    public void setVolume(int volume) {
     if(volume < 0) {
         return;
     }
     if(volume > 100) {
         return;
     }
     this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
