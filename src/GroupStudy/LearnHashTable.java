package GroupStudy;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class LearnHashTable {
    public static void main(String[] args) {
        //similar to hashmap but it is synchronized- one by one. not everything at the same time
        //stopres a value on the basis of key-val
        //key=object
        //hashcode=value
        //hashcode = java provide a particular objects
        //32 bit integer number created by java for every java object
        //whenever you crete an object java creates a code for perticular object
        //any object storing as a key

        Hashtable h1= new Hashtable();
        h1.put(1,"tom");
        h1.put(2,"robert");
        h1.put(1,"jack");

        //create a clone
        Hashtable h2= new Hashtable();
        h2=(Hashtable)h1.clone();

        System.out.println("the valure for h1: " +h1);
        System.out.println("the value for h2: "+h2);
        //h1.clear();


      //contains
        Hashtable h3= new Hashtable();
        h3.put("A", "Tasmi");
        h3.put("B", "is ");
        h3.put("C", "student");


        if (h3.contains("Tasmi") )
            System.out.println("the bvalue is found");

        //print all the values from hashtable using enumeration
        Enumeration e= h3.elements();
        System.out.println("print values from h3 using Enumeration: ");
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


//get all the values form hashtable using entry set -- set of hashtable object

        System.out.println("print values from h3 using entry set: ");
        Set s= h3.entrySet();
        System.out.println(s);

        Hashtable h4= new Hashtable();
        h4.put("A", "Tasmi");
        h4.put("B", "is ");
        h4.put("C", "student");
       // h4.put("C", "student");
        //contains only unique elements and
        // NO NULL KEY OR VALUE- Null pointer exception but in HASHMAP it is allowed
        h4.put("D", null);



        //both of the objects are equal or not

        if(h3.equals(h4))
            System.out.println("both are equal");

//get the value from a key
        System.out.println(h3.get("A"));

//Hashcode Method
        //get the Hashcode of Hashtable object

        System.out.println("hascode value of h3 is " + h3.hashCode());

//generic
        Hashtable <String, String> st= new Hashtable<String, String>();

    }
}
