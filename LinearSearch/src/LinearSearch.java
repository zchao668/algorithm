public class LinearSearch {

    //把构造函数设置为私有，用户则不可以进行new LinearSearch
    private LinearSearch(){}

    //使用static设置此类为静态，则不用新建对象，直接就可以调用
    public static int search(int[] data, int target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] data = {24, 18, 4, 22, 3, 16, 33, 55};

        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res1 = LinearSearch.search(data,666);
        System.out.println(res1);
    }
}
