class Car {
    int speed;
    double regular_price;
    String colour;

    public Car(int speed, double regular_price, String colour) {
        this.speed = speed;
        this.regular_price = regular_price;
        this.colour = colour;
    }

    public double getsaleprice() {
        return regular_price;
    }
}

class Truck extends Car {
    int weight;

    public Truck(int speed, double regular_price, String colour, int weight) {
        super(speed, regular_price, colour);
        this.weight = weight;
    }

    public double getsaleprice() {
        if (weight > 2000) {
            return super.regular_price * 0.9;
        } else {
            return super.regular_price * 0.8;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturer_discount;

    public Ford(int speed, double regular_price, String colour, int year, int manufacturer_discount) {
        super(speed, regular_price, colour);
        this.year = year;
        this.manufacturer_discount = manufacturer_discount;
    }

    public double getsaleprice() {
        return super.getsaleprice() - manufacturer_discount;
    }
}

class Sedan extends Car {
    int length;

    public Sedan(int speed, double regular_price, String colour, int length) {
        super(speed, regular_price, colour);
        this.length = length;
    }

    public double getsaleprice() {
        if (length > 20) {
            return super.getsaleprice() * 0.95;
        } else {
            return super.getsaleprice() * 0.9;
        }
    }
}

public class Myownautoshop {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Red", 22);
        Ford ford1 = new Ford(150, 25000, "Blue", 2020, 3000);
        Ford ford2 = new Ford(160, 27000, "Black", 2021, 3500);
        Car car = new Car(130, 22000, "White");

        System.out.println("Sedan Sale Price: $" + sedan.getsaleprice());
        System.out.println("Ford1 Sale Price: $" + ford1.getsaleprice());
        System.out.println("Ford2 Sale Price: $" + ford2.getsaleprice());
        System.out.println("Car Sale Price: $" + car.getsaleprice());
    }
}