package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map<Integer,String> siniflist=new HashMap<>();
        siniflist.put(101,"Ali, Can, Dev, 1453");
        siniflist.put(102,"Veli, Yan, QA, 2001");
        siniflist.put(103,"Ali, San, Dev, 2002");
        siniflist.put(104,"Doğu, Man, C##, 1995");
        siniflist.put(105,"Kaya, Fan, Java, 2005");
        siniflist.put(106,"Can, Dan, QA, 2007");
        siniflist.put(107,"Han, Zan, Java, 1987");
        siniflist.put(108,"Arda, Ban, Dev, 1999");
        siniflist.put(109,"Aslı, Lan, QA, 2006");

        return siniflist;
    }
}
