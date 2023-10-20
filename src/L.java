import java.io.Console;
class L
{
    public static void main(String[] args)
    {
        String str;
        char ch[];
        Console ref=System.console();
        System.out.println("enter username: ");
        str=ref.readLine();
        //System.out.println("enter password: ");
        //ch=obj.readPassword();
        //String a=String.valueOf(ch);

        System.out.println("username: "+str);
        // System.out.println("password: "+a);
    }
}

