package datestructure;

import java.util.LinkedList;
import java.util.List;

/**
 *@Description: 链表结构的线性表
 *@Author: Ryan
 *@Date: 2018/4/18  22:38
 */

public class LinearList_LinkedList {

    /**
     *@Description: 试用一下LinkedList
     *@Author: Ryan
     *@Date: 2018/4/18  22:54
     */

    public static void testLinkedList(){
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.remove(0);
        list.add(1,"4");

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    private class Data{
        private Object object;
        private Data next = null;

        Data(Object object){
            this.object = object;
        }
    }

    private Data first = null;
    private int size = 0;

    /**
     *@Description: 向链表第一个位置插数据
     *@Author: Ryan
     *@Date: 2018/4/18  22:59
     */
    private void insertFirst(Object o) {
        Data data = new Data(o);
        data.next = first;
        first = data;

        size = size+1;
    }

    private int size(){
        return  size;
    }

    public Data get(int index){
        Data data = first;
        int size = this.size;
        //从first开始以此找几次然后返回
        if (index>size){
            System.out.println("越界了");
        }else {
            if (index==size){
                data = first;
            }else{
                for (int i=0;i<size-index-1;i++){
                    data = data.next;
                }
            }
        }
        return data;
    }


    public static void main(String args[]){
        LinearList_LinkedList l = new LinearList_LinkedList();
        l.insertFirst("1");
        l.insertFirst("2");
        l.insertFirst("3");
        l.insertFirst("4");

        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i).object);
        }

    }
}
