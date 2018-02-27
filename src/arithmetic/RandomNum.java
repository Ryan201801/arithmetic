package arithmetic;

/**
 *@Description: 随机数
 *@Author: Ryan
 *@Date:2018/2/26  19:46
 */
public class RandomNum {
    /**
     * @Description: 从1-max的整数中随机获取n个不同的随机数
     * @Author: Ryan
     * @Date: 2018/2/26  19:50
     */
    public static int[] randomCommon(int max, int n) {
        if (n > max) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            //为了防止0与初始化数组中的0比对
            int num = (int) (Math.random() * max)+1;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }

    /**
     * @Description: 从min-max的整数中随机获取n个不同的随机数
     * @Author: Ryan
     * @Date: 2018/2/26  19:50
     */
    public static int[] randomCommon2(int min, int max, int n) {
        if ((n > (max - min + 1)) ||( max < min)||(min==0)) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * (max - min+1)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }
        /**
         *@Description: 获取0-14，包括0、14的100个随机数
         *@Author: Ryan
         *@Date: 2018/2/26  20:08
         */
    public static void random100() {
        int[] result = new int[100];
        int count = 0;
        while (count < 100) {
            int num = (int)((Math.random() * 15));
                result[count] = num;
                count++;
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] result= RandomNum.randomCommon2(0,15,5);
        for (int i=0;i<5;i++){
            System.out.println(result[i]);
        }
        //RandomNum.random100();
    }

}
