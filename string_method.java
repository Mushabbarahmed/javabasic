public class string_method {

    public static void main(String[] args)
    {
    String a="good morning";
    String a1= new String("   good");
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a1.trim());
        System.out.println(a.substring(3));
        System.out.println(a.substring(3,5));
        System.out.println(a.startsWith("s"));
        System.out.println(a.endsWith("s"));
        System.out.println(a.equalsIgnoreCase("Good Morning"));
        System.out.println(a.equals("Good Morning"));
        System.out.println(a.charAt(7));
        System.out.println(a.replace("r","d"));
        System.out.println(a.concat("assalamualaikum"));
        System.out.println(a);


    }
}
