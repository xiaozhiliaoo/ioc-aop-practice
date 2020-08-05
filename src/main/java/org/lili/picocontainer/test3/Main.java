package org.lili.picocontainer.test3;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * @author lili
 * @date 2019/12/13 20:16
 * @description
 */
public class Main {
    public static void main(String[] args) {
        MutablePicoContainer parent = new DefaultPicoContainer();
        parent.addComponent(Apple.class);
        parent.addComponent(Orange.class);
        parent.addComponent(Pear.class);
        MutablePicoContainer child = parent.makeChildContainer();
        child.addComponent(DependsOnApple.class);
// this is OK
        parent.start();
// cascades to child just fine

        parent = new DefaultPicoContainer();
        parent.addComponent(Apple.class);
        parent.addComponent(Orange.class);
        parent.addComponent(Pear.class);
        child = parent.addChildContainer(new DefaultPicoContainer());
        child.addComponent(DependsOnApple.class);
// this is NOT OK. child can't see parent
        parent.start();
// cascades to child just fine

        parent = new DefaultPicoContainer();
        parent.addComponent(Apple.class).addComponent(Orange.class).addComponent(Pear.class);
        child = parent.addChildContainer(new DefaultPicoContainer(parent));
        child.addComponent(DependsOnApple.class);
// this is OK
        parent.start();
// cascades to child just fine

        parent = new DefaultPicoContainer();
        parent.addComponent(Apple.class).addComponent(Orange.class).addComponent(Pear.class);
        child = new DefaultPicoContainer(parent);
        child.addComponent(DependsOnApple.class);
// this is  OK
        parent.start();
    }
}
