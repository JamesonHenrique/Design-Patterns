package structural.bridge;

public class RemoteControl {
    protected final DeviceImplementation device;

    public RemoteControl(DeviceImplementation device) {
        this.device = device;
    }
    void togglePower() {
        device.setPower(!device.getPower());
        System.out.println(device.getName() + " - Power status -> " + device.getPower());
    }

    void volumeUp() {
        int oldVolume = device.getVolume();
        device.setVolume(device.getVolume() + 10);
        System.out.println(device.getName() + " - Volume mudou de " + oldVolume + " para " + device.getVolume());
    }

    void volumeDown() {
        int oldVolume = device.getVolume();
        device.setVolume(device.getVolume() - 10);
        System.out.println(device.getName() + " - Volume mudou de " + oldVolume + " para " + device.getVolume());
    }
}
