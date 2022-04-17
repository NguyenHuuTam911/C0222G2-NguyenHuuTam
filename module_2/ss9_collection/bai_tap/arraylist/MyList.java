package ss9_collection.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //tao cons có tham số là sức chứa truyền vào =10
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capactity: " + capacity);
        }
    }

    //them ptu vao my list theo chỉ định
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        //neu vi tri cua ptu trong mang ko co gia tri
        // thi them them tu do vào ví trí đó
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }

    public E remove(int index) {
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("error index: "+ index);
        }
        E element=(E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }

    //phuong thuc tra ve so luong
    public int size() {
        return this.size;
    }

    //sao chep ra 1 mang moi
    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    //ktr ptu co trong mang hay ko
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }


    //pthuc lay index của 1 ptu trong mang
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }


    //    pthuc themm 1 ptu  vao mylist
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //pthuc tang kich thuoc cho mang va copy ptu mang cũ vao mang moi
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCaparacity:" + minCapacity);
        }
    }


    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }


    public E get(int index) {
        return (E) elements[index];
    }
}
