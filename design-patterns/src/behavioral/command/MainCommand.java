package behavioral.command;

import java.util.Map;
import java.util.stream.Stream;

public class MainCommand {
    public static void main(String[] args) {
        LightPowerCommand bedroomlightPowerCommand = new LightPowerCommand(new SmartHouseLight("Sala"));
        LightIntensityCommand bedroomLightIntensityCommand = new LightIntensityCommand(new SmartHouseLight("Sala"));
        LightPowerCommand bathroomLightPowerCommand = new LightPowerCommand(new SmartHouseLight("Banheiro"));

        SmartHouseApp smartHouseApp = new SmartHouseApp();

        smartHouseApp.addCommand("btn-1", bedroomlightPowerCommand);
        smartHouseApp.addCommand("btn-2", bathroomLightPowerCommand);
        smartHouseApp.addCommand("btn-3", bedroomLightIntensityCommand);

        smartHouseApp.executeCommand("btn-1");
        smartHouseApp.executeCommand("btn-2");

        Stream.iterate( 0, n -> n + 1)
                .limit(3)
                .forEach(i -> smartHouseApp.executeCommand("btn-3"));

        Stream.iterate( 0, n -> n + 1)
                .limit(2)
                .forEach(i -> smartHouseApp.undoCommand("btn-3"));

    }
}
