package Generic;

public class main {
    public static void main(String[] args) {
        //Nullable<String> a = new Nullable<>(null);
        //a.run();
        String[] arr1 = {"Merhaba","Dünya" };
        Integer[] arr2 = {1,2,3,4,5};
        printArr(arr1);
        printArr(arr2);

        Student<String> s1 = new Student();
        s1.select();
        s1.insert("Merhaba");

    }

    public static <T> void printArr(T[] arr){
        for(T a:arr){
            System.out.println(a);
        }
    }
}
