// Extends specifies the superclass (or parent class)
// Dog is a subclass/child class of Animal
// A subclass can only extend one parent class.
// super() is similar to this(); it's a way to call the constructor on the parent (super) class.
// super() is a lot like this(). It calls the constructor of the parent class.
// this() and super() can never be called in the same constructor

// We want to add earShape and tailShape. bark, run, wagTail methods

public class Dog extends Animal{

    private String earShape;
    private String tailShape;



    public Dog (){
        super("Mutt", "Big", 50);
    }

    // Makes Perky and Curled default values if none are specified
    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    // same signature as makeNoise on Animal
    //     This will be called instead of Animal's makeNoise
    // This is the same kind of method override
    public void makeNoise(){
        if(super.type == "Wolf"){
            System.out.print("Ow woooo");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }

        System.out.println();

    }

    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.print("Dog running");
    }

    private void walk(){
        System.out.print("Dog walking");
    }

    private void wagTail(){
        System.out.print("Tail wagging");
    }

}
