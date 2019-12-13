package org.lili;

import org.lili.test1.Apple;
import org.lili.test1.Juicer;
import org.lili.test1.Peeler;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * @author lili
 * @date 2019/12/13 19:00
 * @description
 */
public class ContainerHierarchies {
    public static void main(String[] args) {
        MutablePicoContainer x = new DefaultPicoContainer();
        MutablePicoContainer y = new DefaultPicoContainer(x);
        MutablePicoContainer z = new DefaultPicoContainer(y);
        x.addComponent(Apple.class);
        y.addComponent(Juicer.class);
        z.addComponent(Peeler.class);
        Peeler peeler = (Peeler) z.getComponent(Peeler.class); // WON'T WORK! peeler will be null
        System.out.println(peeler);
        //peeler = (Peeler) x.getComponent(Peeler.class); // WON'T WORK! This will throw an exception
        Juicer juicer = (Juicer) y.getComponent(Juicer.class);
        //juicer.say();
    }
}
