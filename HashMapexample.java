import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapexample {
    public static void main(String[] args) {
        HashMap<String,String> contactdetails = new HashMap<>();

        //Adding data
        contactdetails.put("Tom","89565848996");
        contactdetails.put("Steve","89654789665");
        contactdetails.put("Erica","569488855");

        //Displaying data using key Method
        for (String str : contactdetails.keySet())
        {
            System.out.println("Name : "  +str + " Contactnumber : " + contactdetails.get(str));
        }

        System.out.println("*********************************************************");

        //Displaying data using Value Method
        for (String str : contactdetails.values())
        {
            System.out.println("Contactnumber : " + str);
        }

        System.out.println("**********************************************************");
        // Accessing data using Map entry

        for (Map.Entry str : contactdetails.entrySet())
        {
            System.out.println("Name : " + str.getKey() + " Contactnumber : " + str.getValue());
        }
        System.out.println("**********************************************************");
        //Removing an element
        contactdetails.remove("Tom");
        for (Map.Entry str : contactdetails.entrySet())
        {
            System.out.println("Name : " + str.getKey() + " Contactnumber : " + str.getValue());
        }
        //Checking size of the hashmap
        System.out.println("current size: " + contactdetails.size());

    }
}
