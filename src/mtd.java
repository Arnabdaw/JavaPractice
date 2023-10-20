class mtd
{
    public static void main(String[] args)
    {
        String a="ARNAB";
        String b="daw";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(a.concat(b));
        System.out.println("length of ARNAB="+a.length());
        System.out.println("length of daw="+b.length());

        String c="     Bubu  Mondal    ";
        String d="baby";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('R'));

        System.out.println(b.equals(a));
        System.out.println(d.replace('b','a'));
    }
}
