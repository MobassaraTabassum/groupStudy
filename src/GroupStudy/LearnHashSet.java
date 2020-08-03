package GroupStudy;
import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<String> h= new HashSet<String>();
        h.add("tasmi");
        h.add("yeasmin");
        h.add("rume");

        System.out.println(h);
        System.out.println(h.size());
//to remove a value
        System.out.println(h.remove("tasmi"));

//to remove all

//        h.clear();
//        System.out.println(h);


        System.out.println(h.contains("tasmi"));
        System.out.println(h.isEmpty());



        //using a iterator

        HashSet<Integer> hashas= new HashSet<Integer>();
        hashas.add(13);
        hashas.add(24);
        hashas.add(4);
        System.out.println(hashas);

        System.out.println(hashas.toArray());
        System.out.println(hashas.hashCode());

        //using an iterator

        Iterator<Integer> it= hashas.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
