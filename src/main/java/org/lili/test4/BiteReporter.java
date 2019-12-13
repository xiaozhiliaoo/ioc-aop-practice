package org.lili.test4;

import org.lili.test1.Apple;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.PicoBuilder;
import org.picocontainer.behaviors.Intercepted;
import org.picocontainer.behaviors.Intercepting;

/**
 * @author lili
 * @date 2019/12/13 21:22
 * @description
 */
public class BiteReporter {
    private Intercepted.Controller controller;
    public BiteReporter(Intercepted.Controller controller) {
        this.controller = controller;
    }
    public boolean takeBite(int grams) {
        System.out.println("Bite of"+ grams +"grams of apple '"+ controller.getInstance() +"'");
        return false; // ignored, but necessary.
    }

    public static void main(String[] args) {
       /* DefaultPicoContainer pico = new DefaultPicoContainer(new Intercepting());
        pico.addComponent(Apple.class, BraeburnApple.class);
        Intercepted intercepted = pico.getComponentAdapter(Apple.class).findAdapterOfType(Intercepted.class);
        intercepted.addPreInvocation(Apple.class, new BiteReporter(intercepted.getController()));
// see also Intercpeted.addPostInvocation(...) method.
        Apple a1 = pico.getComponent(Apple.class); a1.takeBite(100);
// prints Bite of 100 grams of apple 'Braeburn' ... irrespective of what else Braeburn.takeBite(int) does.
        pico = new DefaultPicoContainer();
        pico.as(INTERCEPT).addComponent(Apple.class, BraeburnApple.class); // etc
        pico = new PicoBuilder.withInterception().build();
        pico.addComponent(Apple.class, BraeburnApple.class); // etc
        pico = new PicoBuilder.withBehaviors(interception()).build();
        pico.addComponent(Apple.class, BraeburnApple.class); // etc*/
    }
}
