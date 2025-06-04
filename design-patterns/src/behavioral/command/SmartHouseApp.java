package behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class SmartHouseApp {
    private Map<String, SmartHouseCommand> commands = new HashMap<>();


    void addCommand(String key, SmartHouseCommand light) {
        commands.put(key, light);
    }
    void executeCommand(String key) {
        SmartHouseCommand light = commands.get(key);
        if (light != null) {
            light.execute();
        } else {
            System.out.println("Comando não encontrado: " + key);
        }
    }
    void undoCommand(String key) {
        SmartHouseCommand light = commands.get(key);
        if (light != null) {
            light.undo();
        } else {
            System.out.println("Comando não encontrado: " + key);
        }
    }
}
