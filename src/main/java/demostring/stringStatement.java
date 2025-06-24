package demostring;

public class stringStatement
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        String name = "java programming";
        String res = str +" "+name;

      /*  System.out.print(str);
        System.out.println(name);*/
        System.out.println(res);

        //String length
        System.out.println("Length of String "+str.length());

        System.out.println("caps latter of String : "+name.toUpperCase());

        System.out.println("lower latter of String : "+str.toLowerCase());

        System.out.println("caps latter of String : "+name.replace("java", "Automation"));







    }
}
