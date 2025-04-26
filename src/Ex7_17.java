class Ex7_17 {
    Object iv = new Object() { void method(){} };  // anonymous class
    static Object cv = new Object(){ void method(){} }; // anonymous class

    void myMethod() {
        Object lv = new Object(){ void method(){} }; // anonymous class
    }
}
