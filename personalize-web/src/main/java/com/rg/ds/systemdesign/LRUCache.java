import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // accessOrder = true for LRU
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity; // Remove eldest entry if size exceeds capacity
    }

    public V getValue(K key) {
        return super.get(key); // This will update the access order
    }

    public void putValue(K key, V value) {
        super.put(key, value); // This will update the access order
    }

    public boolean containsKeyInCache(K key) {
        return super.containsKey(key);
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.putValue(1, "One");
        cache.putValue(2, "Two");
        cache.putValue(3, "Three");

        System.out.println(cache.getValue(1)); // Access 1 to make it recently used
        cache.putValue(4, "Four"); // This will evict key 2 (least recently used)

        System.out.println(cache.containsKeyInCache(2)); // Should print false
        System.out.println(cache.containsKeyInCache(3)); // Should print true
    }
}