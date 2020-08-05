package org.lili.picocontainer;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.behaviors.Caching;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lili
 * @date 2019/12/13 18:44
 * @description
 */
public class Main {
    public static void main(String[] args) {
        MutablePicoContainer pico = new DefaultPicoContainer(new Caching());
        pico.addComponent(ArrayList.class);
        List list = pico.getComponent(ArrayList.class);
    }
}
