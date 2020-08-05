package org.lili.picocontainer.test1;

import org.picocontainer.Startable;

/**
 * @author lili
 * @date 2019/12/13 18:48
 * @description
 */
public class Peeler implements Startable {
    private final Peelable peelable;
    public Peeler(Peelable peelable) {
        this.peelable = peelable;
    }
    public void start() {
        peelable.peel();
    }
    public void stop() { }
}
