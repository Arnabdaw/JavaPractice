import java.util.Scanner;
import java.util.Arrays;
class A
{
    public static void main(String[] args)
    {
        String  a[]={"BEHAVIOUR","ATTITUDE","MENTALITY","EDUCATION","DEDICATION","EFFORT"};
        System.out.println("toString() : "+Arrays.toString(a));
        System.out.println("asList() : "+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("deepTostring(): "+Arrays.deepToString(arr));
    }
}
