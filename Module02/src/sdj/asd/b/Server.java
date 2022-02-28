package sdj.asd.b;

import java.io.FileInputStream;
import java.util.ArrayList;

//是
public class Server{
    private static int initial_size;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Server{}";
    }

    public Server() {
    }

    public static void main(String[] args) {
        COOL();

    }

    public static void COOL() {
        System.out.println();
        ArrayList<String> array = new ArrayList();
        //region Description
        array.add("1");
        array.add("2");
        array.add("3");
        //endregion
    }

    public void GetDa() {

        initial_size = 10;
        try {
            FileInputStream fileInputStream=new FileInputStream("1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GG(){
        GetDa();
    }
}