public class Suma{
    int dodaj(int a, int b){
        System.out.println("Przekazano parametry o typie int int");
        return a+b;
    }

    double dodaj(double a, double b){
        System.out.println("Przekazano parametry o typie double double");
        return a+b;
    }

    int dodaj(int a, int b, int c){
        System.out.println("Przekazano parametry o typie int double int");
        return a+b+c;
    }

    double dodaj(double a, int b, int c){
        System.out.println("Przekazano parametry o typie double int int");
        return a+b+c;
    }
}