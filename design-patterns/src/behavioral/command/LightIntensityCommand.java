package behavioral.command;

public class LightIntensityCommand implements SmartHouseCommand {
    private final SmartHouseLight light;

    public LightIntensityCommand(SmartHouseLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.increaseIntensity();
        System.out.println("Intensidade da luz aumentada para: " + light.getIntensity());
    }

    @Override
    public void undo() {
        light.decreaseIntensity();
        System.out.println("Intensidade da luz diminuída para: " + light.getIntensity());
    }
}
