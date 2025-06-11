package behavioral.templateMethod;

import java.util.List;

public class MainTemplateMethod {
    public static void main(String[] args) {
        try {
            CustomerDataParser jsonParser = new CustomerDataParserJSON("design-patterns/src/behavioral/templateMethod/customer.json");
            jsonParser.fixCustomerData();
            List<CustomerData> jsonData = jsonParser.customerData;
            System.out.println("Parsed JSON Data:");
            for (CustomerData customer : jsonData) {
                System.out.println(customer.getName() + " - " + customer.getAge() + " - " + customer.getCpf());
            }

            CustomerDataParser txtParser = new CustomerDataParserTXT("design-patterns/src/behavioral/templateMethod/customer.txt");
            txtParser.fixCustomerData();
            List<CustomerData> txtData = txtParser.customerData;
            System.out.println("\nParsed TXT Data:");
            for (CustomerData customer : txtData) {
                System.out.println(customer.getName() + " - " + customer.getAge() + " - " + customer.getCpf());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
