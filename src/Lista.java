import java.util.LinkedList;

public class Lista {

    public void listing(){
        java.util.List<String> listWithname = new LinkedList<>();

        listWithname.add("Tomek");
        listWithname.add("Klaudia");

        java.util.List<String> otherListWithname = new LinkedList<>();

        otherListWithname.add("Zidane");
        otherListWithname.addAll(listWithname);
        otherListWithname.add("Mango");


        for (int i = 0; i < otherListWithname.size(); i++) {
            System.out.println(otherListWithname.get(i));
        }

        System.out.println("------------------");

        System.out.println(otherListWithname.get(3));

        System.out.println("------------------");

        for (String item : otherListWithname){
            System.out.println(item);
        }
    }
}
