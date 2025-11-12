package com.Kodnest.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;   //  Import added
import java.util.Set;   //  Import added

public class Main {
    public static void main(String[] args) {
        // Thread-safe List
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        //  Thread-safe Map
        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        //  Thread-safe Set
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());

        //  Example usage
        list.add(10);
        map.put(1, 100);
        set.add(50);

        System.out.println("List: " + list);
        System.out.println("Map: " + map);
        System.out.println("Set: " + set);
    }
}
