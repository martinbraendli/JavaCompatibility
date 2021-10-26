package li.braend.javacompatibility.java8;

import li.braend.javacompatibility.java11.Java11Klasse;

public class Java8Klasse {

    public boolean isBlankJava11() {
        return "java11string".isBlank();
    }

    public void useJava11Klasse() {
        Java11Klasse j11 = new Java11Klasse();
        j11.isBlankJava11();
    }

}
