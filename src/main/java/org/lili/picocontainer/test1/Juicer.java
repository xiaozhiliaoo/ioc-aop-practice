package org.lili.picocontainer.test1;

/**
 * @author lili
 * @date 2019/12/13 18:48
 * @description
 */
public class Juicer {
    private final Peelable peelable;
    private final Peeler peeler;
    public Juicer(Peelable peelable, Peeler peeler) {
        this.peelable = peelable;
        this.peeler = peeler;
    }
    public void say() {
        peelable.peel();
        System.out.println("hi~");
    }
}
