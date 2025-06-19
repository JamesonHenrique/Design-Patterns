package behavioral.templateMethod;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public  class CustomerDataParserTXT extends CustomerDataParser {

    protected CustomerDataParserTXT(String filePath) {
        super(filePath);
    }

    @Override
    protected List<CustomerData> parseData() throws IOException {
        List<CustomerData> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean first = true;
            while ((line = br.readLine()) != null) {
                if (first) { first = false; continue; }
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    CustomerData cd = new CustomerData(
                            parts[0].trim(),
                            Integer.parseInt(parts[1].trim()),
                            parts[2].trim()
                    );
                    list.add(cd);
                }
            }
        }
        return list;
    }


}
