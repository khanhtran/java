public class TestHashMap {
    public static void main(String[] args) {
        int SIZE = 16;

        for (int i = 0; i < 10000; i++) {
            int index = i & (SIZE - 1);
            assert(index < SIZE);
        }
    }
}
