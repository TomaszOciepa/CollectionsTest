import java.util.HashSet;

public class Set {

    public void seting(){
        java.util.Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Tomek");
        setWithNames.add("Klaudia");
        setWithNames.add("Tomek");

        java.util.Set<String> otherSetNames = new HashSet<>();
        otherSetNames.add("Zenek");
        otherSetNames.add("Klaudia");
        otherSetNames.addAll(setWithNames);

        System.out.println(otherSetNames.isEmpty());
        System.out.println(otherSetNames.size());
        System.out.println(otherSetNames.contains("Tomek"));

        otherSetNames.remove("Zenek");

        System.out.println(otherSetNames.size());

//        for (int i = 0; i < otherSetNames.size(); i++) {
//
//            System.out.println(otherSetNames.);
//
//        }




    }
}
