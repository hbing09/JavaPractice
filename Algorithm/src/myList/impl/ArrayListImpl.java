package myList.impl;

import myList.IArrayList;

public class ArrayListImpl implements IArrayList {

    private int[] data;

    private int size;

    public ArrayListImpl() {
        this(10);
    }

    public ArrayListImpl(int capacity) {
        this.data = new int[capacity];
        this.size = 0;

    }

    /**
     * time: O(1)
     * @return
     */
    @Override
    public int capacity() {
        return data.length;
    }

    /**
     * time: O(1)
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * time: O(n)
     * @return
     */
    @Override
    public void add(int element) {
        add(size, element); //用下面的 add 函数，减少重复，进行优化
    }

    /**
     * 加 resize 前：
     * time: O(1)
     * 加 resize 后：
     * O(2n) ，每个元素执行2次，所有元素，O(2n); 其实还是O(n)
     * 均摊的时间复杂度，面试容易考到
     * @return
     */
    @Override
    public void add(int index, int element) {
        /**
        * if (size == data.length) {
        *     throw new IllegalArgumentException("数组已满");//这个时候我们需要扩容，不允许这种已满的情况出现
        * }
        */

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误 （小于0 或 大于初始化容量）");
        }

        if (size == data.length) {
            resize(data.length * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = element;
        size++;
    }

    /**
     * time: O(n)
     * @return
     */
    @Override
    public boolean contains(int element) { //目的是要遍历一遍所有圆度
        for (int i = 0; i < size; i++) { //注意这里 i 的范围应该是小于 size，因为 length刚开始为空
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * time: O(1)
     * @return
     */
    @Override
    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误 （小于0 或 大于初始化容量）");
        }
        return data[index];
    }

    /**
     * time: O(1)
     * @return
     */
    @Override
    public void set(int index, int element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误 （小于0 或 大于初始化容量）");
        }
        data[index] = element;
    }

    /**
     * time: O(n)
     * @return
     */
    @Override
    public int remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index 输入错误 （小于0 或 大于初始化容量）");
        }
        int res = data[index]; // 返回要删除的元素

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;

        //Lazy 思想：当前进行到临界条件的时候不进行操作，等再删掉一个的时候在进行缩容
        if (data.length / 4 == size && data.length / 2 !=0) {
            resize(data.length / 2);
        }
        return res;
    }

    /**
     * time: O(n)
     * @return
     */
    @Override
    public void removeElement(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) { //注意这里 i 的范围应该是小于 size，因为 length刚开始为空
            if (data[i] == element) {
                index = i;
            }
        }
        if (index== -1) {
            throw new IllegalArgumentException("元素不存在");
        }
        remove(index);
    }


    @Override
    public void print() {
        System.out.println("size : " + size);
        System.out.println("capacity : " + data.length);
        for (int i = 0; i < size; i++) {
            System.out.println(data[i] + " ");
        }
    }

    /**
     * time : O(n)
     * @param capacity
     */
    @Override
    public void resize(int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
}