package structural.bridge;

public class MainBridge {
    public static void main(String[] args) {
        DeviceImplementation radio = new Radio();
        DeviceImplementation tv = new TV();

        RemoteControl radioRemote = new RemoteControl(radio);
        RemoteControl tvRemote = new RemoteControl(tv);

        System.out.println("Testando Radio:");
        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.volumeDown();
        radioRemote.togglePower();

        System.out.println("\nTestando TV:");
        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.togglePower();
    }

}
