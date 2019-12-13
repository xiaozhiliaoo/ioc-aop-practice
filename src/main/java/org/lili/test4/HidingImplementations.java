package org.lili.test4;

import org.lili.test1.Apple;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.PicoBuilder;
import org.picocontainer.behaviors.ImplementationHiding;

import static org.picocontainer.Characteristics.HIDE_IMPL;
import static org.picocontainer.behaviors.Behaviors.implementationHiding;

/**
 * @author lili
 * @date 2019/12/13 21:31
 * @description
 */
public class HidingImplementations {
    public static void main(String[] args) {
       /* DefaultPicoContainer pico = new DefaultPicoContainer(new ImplementationHiding());
        pico.addComponent(Apple.class, AppleImpl.class);
        Apple a1 = pico.getComponent(Apple.class); // cannot cast back to AppleImpl

        pico = new DefaultPicoContainer();
        pico.as(HIDE_IMPL).addComponent(Apple.class, AppleImpl.class);
        Apple a1 = pico.getComponent(Apple.class); // cannot cast back to AppleImpl

        pico = new PicoBuilder().withImplementationHiding().build();
        pico.addComponent(Apple.class, AppleImpl.class);
        Apple a1 = pico.getComponent(Apple.class); // cannot cast back to AppleImpl

        pico = new PicoBuilder().withBehaviors(implementationHiding()).build();
        pico.addComponent(Apple.class, AppleImpl.class);
        Apple a1 = pico.getComponent(Apple.class); // cannot cast back to AppleImpl*/
    }
}
