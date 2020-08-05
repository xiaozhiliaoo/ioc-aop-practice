package org.lili.picocontainer.test2;

import org.picocontainer.*;
import org.picocontainer.monitors.ComposingMonitor;
import org.picocontainer.monitors.LifecycleComponentMonitor;

/**
 * @author lili
 * @date 2019/12/13 19:55
 * @description
 */
public class Apple implements Startable {
    public void start() {
        // listen on socket, start thread etc.
        System.out.println("start");
    }

    public void stop() {
        // stop listening on socket, kill thread etc.
        System.out.println("stop");

    }

    public static void main(String[] args) {
        MutablePicoContainer pico = new DefaultPicoContainer(new ComposingMonitor(new LifecycleComponentMonitor()));
        //MutablePicoContainer pico = new DefaultPicoContainer(new StartableLifecycleStrategy(new CommonsLoggingComponentMonitor()));
        pico.addComponent(Apple.class);
        pico.start(); // start gets called
        Apple a = pico.getComponent(Apple.class);

//        MutablePicoContainer pico2 = new DefaultPicoContainer(new ReflectionLifecycleStrategy());
//        pico2.addComponent(Apple.class);
//        pico2.start(); // start gets called, and propagates to components
//        Apple a2 = pico.getComponent(Apple.class);
//
//        MutablePicoContainer pico3 = new DefaultPicoContainer(new JavaEE5LifecycleStrategy());
//        pico3.addComponent(Apple.class);
//        pico3.start(); // start gets called, and propagates to components
//        Apple a3 = pico.getComponent(Apple.class);
    }
}
