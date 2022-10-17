class  TwoDshape {
    private double widsh;
    private double height;
    // Конструктор по умолчанию
    TwoDshape() {
        widsh = height = 0.0;
    }
    //Параметризированный конструктор
    TwoDshape(double w, double h) {
        widsh = w;
        height = h;
    }
    TwoDshape(double x) {
        widsh = height = x;
    }

    //Методы доступа
    double getWidsh() {return widsh;}
    double getHeight() {return height;}
    void setWidsh(double w) {widsh = w;}
    void setHeight(double h) {height = h;}
    void showDim() {
        System.out.println("Ширина и высота - " +
                widsh + " и " + height);
    }
}
// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Traingle extends TwoDshape { // Класс Triangle насnедует кnасс TwoDShape
    private String style;

    Traingle() {
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    // Конструктор
    Traingle(String s,double w, double h) {
        super(w, h); // вызвать конструктор суперкласса

        style = s;
    }

    Traingle(double x) {
        super(x); //  вызвать конструктор суперкласса с одним аргументом

        style = "закрашенный";
    }
    double area() {
        return getWidsh() * getHeight() / 2; // Из класса Triangle можно обращаться к членам
        //класса ТWoDShape так, как еслм бы это были eгo
        //собственные члены
    }

    void showStyle() {
        System.out.println("прямоугольник " + style);
    }
}


public class Main {
    public static void main(String[] args) {

        Traingle t1 = new Traingle();
        Traingle t2 = new Traingle("закрашенный", 4.0, 4.0);
        Traingle t3 = new Traingle(4.0);


        System.out.println("Инфopмaция о t1: ");
        t1.showStyle();
        t1.showDim ();
        System.out.println("Плoщaдь - "+ t1.area());
        System.out.println();

        System.out.println("Инфopмaция о t2: ");
        t2.showStyle();
        t2.showDim() ;
        System.out.println("Плoщaдь - "+ t2.area());
        System.out.println();

        System.out.println("Инфopмaция о t2: ");
        t3.showStyle();
        t3.showDim() ;
        System.out.println("Плoщaдь - "+ t2.area());


    }
}
