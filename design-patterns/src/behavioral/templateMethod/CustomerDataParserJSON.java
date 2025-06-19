package behavioral.templateMethod;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class CustomerDataParserJSON extends CustomerDataParser {

    protected CustomerDataParserJSON(String filePath) {
        super(filePath);
    }

    protected List<CustomerData> parseData() throws IOException {
        String raw = Files.readString(Paths.get(filePath)).trim();

        if (!raw.startsWith("[") || !raw.endsWith("]"))
            throw new IOException("Apenas arrays simples suportados");

        raw = raw.substring(1, raw.length() - 1);
        String[] objs = raw.split("(?<=}),\\s*(?=\\{)");

        List<CustomerData> list = new ArrayList<>();
        for (String o : objs) {
            Map<String, String> map = new HashMap<>();
            String body = o.trim();
            body = body.substring(1, body.length() - 1);
            for (String kv : body.split(",")) {
                String[] p = kv.split(":", 2);
                String key = p[0].trim().replaceAll("\"", "");
                String val = p[1].trim().replaceAll("\"", "");
                map.put(key, val);
            }
            String nome = map.get("nome");
            String cpf = map.get("cpf");
            int idade = map.containsKey("idade") ? Integer.parseInt(map.get("idade")) : 0;
            if (nome != null && cpf != null) {
                list.add(new CustomerData(nome, idade, cpf));
            }
        }
        return list;
    }
}
