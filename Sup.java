class Sup {
    void who() {
        System.out.println("who() в Sup");
    }
}
class Sub1 extends Sup{
    void who() {
        System.out.println("who() в SuЫ");
    }
}
class Sub2 extends Sup {
    void who() {
        System.out.println("who() в Sub2");
    }
}
class DynDispDemo {
    public  static void main(String args[]) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;
        //В каждом нз
        //этих вызовов
        //выбор версии
        //метода who ( ) осущестеnяется
        //по типу объекта,
        //на который
        //указывает ссыnка во время выполнения
        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
