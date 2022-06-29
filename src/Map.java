import java.util.HashMap;

public class Map {

    public void mapss(){
        java.util.Map<String, String> pairsMap = new HashMap<>();
        pairsMap.put("Marek", "Adela");
        pairsMap.put("Ariel", "Magda");

        java.util.Map<String, String> otherPairsMap = new HashMap<>();
        otherPairsMap.put("Bolek", "Asia");
        otherPairsMap.put("Adam", "Ewa");

        pairsMap.putAll(otherPairsMap);

//        System.out.println(pairsMap.get("Marek"));
//        System.out.println(pairsMap.size());
//        System.out.println(pairsMap.isEmpty());
//        System.out.println(pairsMap.containsKey("Jan"));
//        System.out.println(pairsMap.containsValue("Adela"));

        System.out.println("-----------");
        System.out.println("Wartości");

        for (String value: pairsMap.values()) {
            System.out.println(value);
        }

        System.out.println("-----------");
        System.out.println("Po kluczach i pobieranie wartości");

        for (String key: pairsMap.keySet()) {
            String value = pairsMap.get(key);
            System.out.println("key: "+key+" value: "+value);
        }
        

    }
}
