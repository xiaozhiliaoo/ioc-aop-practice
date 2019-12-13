package org.lili.test1;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.behaviors.Caching;

/**
 * @author lili
 * @date 2019/12/13 18:49
 * @description
 */
public class Main {
    public static void main(String[] args) {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(Apple.class);
        pico.addComponent(Juicer.class);
        pico.addComponent(Peeler.class);
        //you can not see any new keyword
        Juicer juicer = (Juicer) pico.getComponent(Juicer.class);
        juicer.say();
        pico.start();

        MutablePicoContainer parent = new DefaultPicoContainer(new Caching());
        MutablePicoContainer child = new DefaultPicoContainer(parent); // We must let the parent container know about the child container.
        parent.addComponent(child); // This will start the parent, which will start the child.
        parent.start();

        //pico = new DefaultPicoContainer(new BehaviorClass());

    }
}
