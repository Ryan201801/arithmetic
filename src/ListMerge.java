import java.util.ArrayList;
import java.util.List;

/**
 *@Description:将所有在listB中存在，但listA中不存在的字符串，存放到A中(重复的也算)
 *@Author:Ryan
 *@Date:2018/1/29  23:36
 */
public class ListMerge {

    /**
     * 将所有在listB中存在，但listA中不存在的字符串，存放到A中
     */
    public static List<String> comList(List<String> listA, List<String> listB){

        int sizeA = listA.size();
        int sizeB = listB.size();

        for (int j=0;j<sizeB;j++){
            boolean flag = true;
            for (int i = 0;i<sizeA;i++){
                if ((listB.get(j).equals(listA.get(i)))){
                    flag = false;
                }
            }
            if (flag==true){
                listA.add(listB.get(j));
            }
        }
        return listA;
    }


    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        for (int i = 1;i<11;i++){
            a.add(String.valueOf(i));
            b.add(String.valueOf(i+2));
        }

        List<String> c = comList(a,b);
        for (int i = 0;i<c.size();i++){
            System.out.println(c.get(i));
        }
    }


}
