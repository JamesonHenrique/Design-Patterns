package behavioral.templateMethod;

import java.util.List;
import java.util.ArrayList;

public abstract class CustomerDataParser {
    protected String filePath;
    protected List<CustomerData> customerData = new ArrayList<>();

    protected CustomerDataParser(String filePath) {
        this.filePath = filePath;
    }

    public final void fixCustomerData() throws Exception {
        customerData = parseData();
        customerData = fixCpf(customerData);
    }

    private List<CustomerData> fixCpf(List<CustomerData> input) {
        for (CustomerData cd : input) {
            String raw = cd.getCpf();
            String digits = raw.replaceAll("\\D+", "");
            digits = String.format("%11s", digits).replace(' ', '0');
            cd.setCpf(digits);
        }
        return input;
    }

    protected abstract List<CustomerData> parseData() throws Exception;
}
