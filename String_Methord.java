public class String_Methord {

    public static void main(String[] args) {

        String str = "Java Programming";

        // 1. length()
        System.out.println("length(): " + str.length());

        // 2. charAt()
        System.out.println("charAt(2): " + str.charAt(2));

        // 3. substring()
        System.out.println("substring(5): " + str.substring(5));
        System.out.println("substring(0,4): " + str.substring(0, 4));

        // 4. contains()
        System.out.println("contains(\"Pro\"): "
                + str.contains("Pro"));

        // 5. equals()
        String s1 = "Java";
        String s2 = "java";

        System.out.println("equals(): "
                + s1.equals(s2));

        // 6. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): "
                + s1.equalsIgnoreCase(s2));

        // 7. toUpperCase()
        System.out.println("toUpperCase(): "
                + str.toUpperCase());

        // 8. toLowerCase()
        System.out.println("toLowerCase(): "
                + str.toLowerCase());

        // 9. replace()
        System.out.println("replace(): "
                + str.replace("Java", "Python"));

        // 10. replaceAll()
        System.out.println("replaceAll(): "
                + str.replaceAll("a", "@"));

        // 11. replaceFirst()
        System.out.println("replaceFirst(): "
                + str.replaceFirst("a", "@"));

        // 12. startsWith()
        System.out.println("startsWith(\"Java\"): "
                + str.startsWith("Java"));

        // 13. endsWith()
        System.out.println("endsWith(\"ing\"): "
                + str.endsWith("ing"));

        // 14. indexOf()
        System.out.println("indexOf('a'): "
                + str.indexOf('a'));

        // 15. lastIndexOf()
        System.out.println("lastIndexOf('a'): "
                + str.lastIndexOf('a'));

        // 16. trim()
        String space = "   Hello Java   ";
        System.out.println("trim(): "
                + space.trim());

        // 17. isEmpty()
        String empty = "";
        System.out.println("isEmpty(): "
                + empty.isEmpty());

        // 18. concat()
        System.out.println("concat(): "
                + s1.concat(" Language"));

        // 19. compareTo()
        System.out.println("compareTo(): "
                + s1.compareTo(s2));

        // 20. compareToIgnoreCase()
        System.out.println("compareToIgnoreCase(): "
                + s1.compareToIgnoreCase(s2));

        // 21. split()
        String fruits = "Apple,Mango,Banana";

        String[] arr = fruits.split(",");

        System.out.println("split(): ");

        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 22. join()
        String joined = String.join("-",
                "Java", "Python", "C++");

        System.out.println("join(): "
                + joined);

        // 23. valueOf()
        int number = 100;

        String numStr = String.valueOf(number);

        System.out.println("valueOf(): "
                + numStr);

        // 24. toCharArray()
        char[] chars = s1.toCharArray();

        System.out.println("toCharArray(): ");

        for (char c : chars) {
            System.out.println(c);
        }

        // 25. matches()
        String email = "test@gmail.com";

        System.out.println("matches(): "
                + email.matches(".*@gmail.com"));

        // 26. repeat()
        System.out.println("repeat(): "
                + "Hi ".repeat(3));

        // 27. isBlank()
        String blank = "   ";

        System.out.println("isBlank(): "
                + blank.isBlank());

        // 28. strip()
        System.out.println("strip(): "
                + space.strip());

        // 29. stripLeading()
        System.out.println("stripLeading(): "
                + space.stripLeading());

        // 30. stripTrailing()
        System.out.println("stripTrailing(): "
                + space.stripTrailing());

        // 31. intern()
        String interned = str.intern();

        System.out.println("intern(): "
                + interned);

        // 32. formatted()
        String format =
                "My name is %s and age is %d"
                .formatted("Rahul", 22);

        System.out.println("formatted(): "
                + format);
    }
}