 class A {
    int i;
}
class B extends A {
    int i; // эта переменная i скрывает переменную
            // i из класса A
    B(int a, int b) {
        super.i = a; // i из класса A
        i = b;       // i из класса B
    }

    void show() {
        System.out.println("i в суперклассе: "+ super.i);
        System.out.println("i в подклассе: " + i);
    }
}
class  UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1,2);

        subOb.show();
    }
}
