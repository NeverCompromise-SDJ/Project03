package sdj.asd.a;

import sdj.asd.b.Server;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SongDongJie
 * @create 2022/2/25 - 20:29
 */
public class Template {
    private static final Server SER = new Server();
    public static final int num = 1;
    private static final String str = "123";
    public static final String str2 = "1233";
    public static final int i = 2;
    public static final String a = "a1";
    public static final int a = 1;
    public static final String ss = "ss";
    /**
    * 宋
    */
    private int person;
    /**
    * 栋
    */
    private String person2;


    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Template.main");
    }

    public void Babe(int a, String b) {
        int c;
        System.out.println("c = " + c);
        int d;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Template.Babe");
        System.out.println("d = " + d);
        System.out.println(c);
        System.out.println(d);
        String[] arr = new String[]{"a", "b", "c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        for (Object o : arrayList) {
            if (o == null) {

            }
            if (o != null) {

            }
        }
        for (int i = 0; i < arrayList.size(); i++) {

        }
        for (int a = arrayList.size() - 1; a >= 0; a--) {

        }
        if (arrayList == null) {

        }
        if (arrayList == null) {

        }
        if (arrayList != null) {

        }

    }

}
