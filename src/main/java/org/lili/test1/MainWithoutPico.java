package org.lili.test1;

import org.lili.test1.Apple;
import org.lili.test1.Juicer;
import org.lili.test1.Peeler;

/**
 * @author lili
 * @date 2019/12/13 18:56
 * @description
 */
public class MainWithoutPico {
    public static void main(String[] args) {
        Juicer juicer = new Juicer(new Apple(), new Peeler(new Apple()));
        juicer.say();
    }
}
