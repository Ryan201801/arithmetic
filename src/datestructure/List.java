package datestructure;

/**
 *@Description: 数据结构——顺序线性表
 *@Author: Ryan
 *@Date: 2018/2/27  21:55
 */

public class List {

    /**
     *@Description: 打印数组中的元素
     *@Author: Ryan
     *@Date: 2018/2/27  22:20
     */

    public static void printArray(int[] array){
        if (array!=null&&array.length>0){
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
    }

    /**
     *@Description: 向数组中array的第i个位置插入number
     *@Author: Ryan
     *@Date: 2018/2/27  22:23
     */
    public static int[] insert(int[] array,int i,int number){
        /** 思路
         * 1、判断能不能插入（长度是否超出的问题不用考虑，因为数组初始化需要给定长度，且默认数字为0；位置是否存在）
         * 2、把i位置及以后的元素后移，空出位置
         * 3、把number放到该位置
         */
        //数组长度+1
        int[] arrayLong = new int[array.length+1];
        //判断i是否在数组的位置范围
        if (i<0||i>9){
            System.out.println("i不在数组的位置范围");
            return null;
        }else {
            //把number放到该位置，把数组array的元素从i开始位置后移一位
            for (int j=0;j<arrayLong.length;j++){
                if (j==i){
                    arrayLong[j] = number;
                }else if (j>i){
                    arrayLong[j] = array[j-1];
                }else{
                    arrayLong[j] = array[j];
                }
            }
        }
        return arrayLong;
    }

    public  static void main(String[] args){

        int[] array = new int[10];
        System.out.println(array.length);
        System.out.println("----------------------------");
        for (int i = 0;i<8;i++){
            array[i] = i;
        }
        printArray(array);
        System.out.println("----------------------------");
        int[] arrayAdd = insert(array,3,33);

        printArray(arrayAdd);
    }


}
