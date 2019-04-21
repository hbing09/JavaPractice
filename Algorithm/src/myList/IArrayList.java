package myList;

public interface IArrayList {
    /**
     * 容量大小
     * @return
     */
    int capacity();
    /**
     * 实际占用大小
     */
    int size();

    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();

    void add(int element);

    /**
     * 加入：中间插入
     */
    void add(int index, int element);

    /**
     * 查找元素
     * @param element
     * @return
     */
    boolean contains(int element);

    /**
     * 找到元素
     * @param index
     * @return
     */
    int get(int index);

    /**
     * 修改元素
     * @param index
     * @param element
     */
    void set(int index, int element);

    /**
     * 根据 index 查找删除
     * @param index
     * @return
     */
    int remove(int index);

    /**
     * 找到元素并删除
     * @param element
     * @return
     */
    void removeElement(int element);

    /**
     *打印数据和结果
     */
    void print();

    /**
     * 改变 capacity 的大小
     */
    void resize(int capacity);

}
