class Car {
    int speed = 0;
    float longtituade = 10f;
    float aptitude = 10f; 
}

public class Lamborgini {
    Car lb = new Car();
    
    public void addSpeed(int incement) {
        lb.speed += incement;
    }
    
    public int getSpeed() {
        return lb.speed;
    }
}


