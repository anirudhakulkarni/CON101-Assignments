public class q
{
  public static void main(String[] args)
  {
    char q = 34;
    String[] l = {
    "public class q",
    "{",
    "  public static void main(String[] args)",
    "  {",
    "    char q = 34;",
    "    String[] l = {",
    "    ",
    "    };",
    "    for(int i = 0; i < 6; i++)",
    "        System.out.println(l[i]);",
    "    for(int i = 0; i < l.length; i++)",
    "        System.out.println(l[6] + q + l[i] + q + ',');",
    "    for(int i = 7; i < l.length; i++)",
    "        System.out.println(l[i]);",
    "  }",
    "}",
    };
    for(int i = 0; i < 6; i++)
        System.out.println(l[i]);
    for(int i = 0; i < l.length; i++)
        System.out.println(l[6] + q + l[i] + q + ',');
    for(int i = 7; i < l.length; i++)
        System.out.println(l[i]);
  }
}