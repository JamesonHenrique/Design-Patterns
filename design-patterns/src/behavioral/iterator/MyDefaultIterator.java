package behavioral.iterator;

public class MyDefaultIterator implements MyIteratorProtocol<String> {
    private final MyDataStructure dataStructure;
    private int index = 0;

    public MyDefaultIterator(MyDataStructure dataStructure) {
        this.dataStructure = dataStructure;
    }

    @Override
    public boolean hasNext() {
        return index < dataStructure.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null;
        }

        String value = dataStructure.getItems().get(index);
        index++;
        return value;
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
