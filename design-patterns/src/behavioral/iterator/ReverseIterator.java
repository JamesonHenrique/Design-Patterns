package behavioral.iterator;

public class ReverseIterator implements MyIteratorProtocol<String> {
    private final MyDataStructure dataStructure;
    private int index;

    public ReverseIterator(MyDataStructure dataStructure) {
        this.dataStructure = dataStructure;
        reset();
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null;
        }
        String value = dataStructure.getItems().get(index);
        index--;
        return value;
    }

    @Override
    public void reset() {
        this.index = dataStructure.size() - 1;
    }
}
