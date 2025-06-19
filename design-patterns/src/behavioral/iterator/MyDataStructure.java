package behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyDataStructure implements Iterable<String> {
    private final List<String> items = new ArrayList<>();
    private MyIteratorProtocol<String> iterator = new MyDefaultIterator(this);

    public void addItem(String... newItems) {
        items.addAll(Arrays.asList(newItems));
    }

    public List<String> getItems() {
        return items;
    }

    public int size() {
        return items.size();
    }

    public void changeIterator(MyIteratorProtocol<String> newIterator) {
        this.iterator = newIterator;
    }

    @Override
    public Iterator<String> iterator() {
        iterator.reset();
        return iterator;
    }
}