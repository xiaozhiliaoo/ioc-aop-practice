package org.lili.picocontainer.test4;

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
