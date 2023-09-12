package org.inwork;


/**
 * example_1
 */

public class Main {
    public static void main(String[] args) {
        Box<Cake> cakeBox1 = new Box<>();
        Box<Pie> cakeBox2 = new Box<>();
        Box<Tart> cakeBox3 = new Box<>();
        cakeBox1.put(new Cake());
        cakeBox1.get();

    }
}

/**
 Box for cakes
 */
class CakeBox {

    private Cake cake;

    public void put(Cake cake) {
        this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}

/**
 Box for pies
 */
class PieBox {

    private Pie pie;

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}


/**
 Box for tarts
 */
class TartBox {

    private Tart tart;

    public void put(Tart tart) {
        this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}

/*
    Hundred more such boring classes OR ...
    magic class for everything everybody is waiting for
*/
class Box <T>{
    private T t;

    public T get() {
        System.out.println("Коробка для "+t.getClass()+" получена");
        return t;
    }

    public void put(T t) {
        this.t = t;
        System.out.println("Коробка для "+t.getClass()+" создана");
    }
}

// Don't change classes below
class Cake { }

class Pie { }

class Tart { }

/**
 * example_2
 */

//class Main {
//    public static void main(String... args) {
//        // correct the next line
//        Printer<String> printer = new Printer();
//
//        // do not change the code below
//        printer.set("value");
//        printer.print();
//    }
//}
//
//class Printer<T> {
//    private T value;
//
//    void set(T value) {
//        this.value = value;
//    }
//
//    void print() {
//        System.out.println("Passed value: " + value);
//    }
//}
