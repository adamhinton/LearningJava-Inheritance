// Extends specifies the superclass (or parent class)
// Dog is a subclass/child class of Animal
// A subclass can only extend one parent class.
// super() is similar to this(); it's a way to call the constructor on the parent (super) class.
// super() is a lot like this(). It calls the constructor of the parent class.
// this() and super() can never be called in the same constructor


public class Dog extends Animal{

    public Dog (){
        super("Mutt", "Big", 50);
    }

}
