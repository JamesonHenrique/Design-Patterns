package behavioral.iterator;

public class MainIterator {
    public static void main(String[] args) {
        MyDataStructure ds  = new MyDataStructure();
        ds.addItem("A","B","C","D","E");

        for (String item : ds) {
            System.out.println(item);
        }

        ds.changeIterator(new ReverseIterator(ds));

        System.out.println("\n");
        for (String item : ds) {
            System.out.println(item);
        }
    }
}
