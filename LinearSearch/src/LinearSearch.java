public class LinearSearch {

    //把构造函数设置为私有，用户则不可以进行new LinearSearch
    private LinearSearch(){}

    //使用static设置此类为静态，则不用新建对象，直接就可以调用
    public static <E> int search(E[] data, E target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Integer[] data = {24, 18, 4, 22, 3, 16, 33, 55};

        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res1 = LinearSearch.search(data,666);
        System.out.println(res1);

        Student[] students = {new Student("tom"),new Student("Bob"),new Student("Alice")};
        Student Bob = new Student("Bob");
        int res2 = LinearSearch.search(students,Bob);
        System.out.println(res2);
    }
}
