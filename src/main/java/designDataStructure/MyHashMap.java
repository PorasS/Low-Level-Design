package designDataStructure;

public class MyHashMap<k, v> {
    private static final int INITIAL_SIZE = 1 << 4; //16
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    class Entry<K, V> {
        public K key;
        public V value;
        public Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }
    }

    public void put(k key, v value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if (node == null) {
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }

            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;
        }
    }

    public v get(k key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while (node != null) {
            if (node.key.equals(key)) {
                return (v) node.value;
            }
            node = node.next;
        }

        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>(7);
        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "pratik");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "guys");
        map.put(10, "?");

        String value = map.get(5);
        System.out.println(value);
    }

}
