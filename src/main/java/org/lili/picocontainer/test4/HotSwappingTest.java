package org.lili.picocontainer.test4;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.gems.behaviors.HotSwapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lili
 * @date 2019/12/13 21:28
 * @description
 */
public class HotSwappingTest {
    public static void main(String[] args) {

        DefaultPicoContainer pico = new DefaultPicoContainer(new HotSwapping());
        pico.addComponent(Map.class, HashMap.class);
        Map<String,String> firstMap = pico.getComponent(Map.class);
        firstMap.put("foo","bar");
        System.out.println(firstMap);
//        HotSwappable hs = (HotSwappable) pico.getComponentAdapter(Map.class);
//        Object oldMap = hs.swapRealInstance(new HashMap());
//        Map secondMap = pico.getComponent(Map.class);
//        secondMap.put("apple","orange");
//        System.out.println(secondMap);
    }
}
