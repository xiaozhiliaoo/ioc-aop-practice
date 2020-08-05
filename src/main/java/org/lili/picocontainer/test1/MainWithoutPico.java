package org.lili.picocontainer.test1;

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
