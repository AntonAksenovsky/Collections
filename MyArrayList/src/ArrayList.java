public class ArrayList implements List {
    public Object[] array;
    private int size = 0;

    public ArrayList() {
        array = new Object[10];
    }

    public ArrayList(int capacity) {
        array = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        growAsNeeded();
        array[size++] = item;
    }

    @Override
    public void add(int index, Object item) {
        checkForRange(index);
        growAsNeeded();
        shiftItems(index);
        array[index] = item;
        size++;
    }

    private void shiftItems(int index) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
    }

    private void checkForRange(int index) {
        if ((index < 0) && (index > size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void growAsNeeded() {
        if (size == array.length) {
            Object[] newArray = new Object[(array.length * 3) / 2 + 1];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            //array = Arrays.copyOf(array, (array.length * 3) / 2 + 1);
        }
    }

    @Override
    public Object get(int index) {
        if ((index < size) && (index >= 0)) {
            return array[index];
        }
        return null;
    }

    @Override
    public void set(int index, Object item) {
        checkForRange(index);
        array[index] = item;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i <= size; i++) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        for (int i = size; i >= 0; i--) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i <= size; i++) {
            array[i] = array[i + 1];
            array[size--] = null;
        }
    }

    @Override
    public void remove(Object item) {
        for (int i = 0; i <= size; i++) {
            if (item.equals(array[i])) {
                array[i] = array[i + 1];
                array[size--] = null;
            }
        }
    }

    @Override
    public List subList(int from, int to) {
        checkForRange(from, to);
        List subList = new ArrayList(to - from);
        for (int i = from; i < to; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    private void checkForRange(int from, int to) {
        if ((from > to) || (from < 0) || (to > size)) {
            throw new IndexOutOfBoundsException();
        }
    }

}
