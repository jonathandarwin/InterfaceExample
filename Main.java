public class Main {
	public static void main(String[] args){
		// THE USE OF INTERFACE 1 : All the class that implements the interface class
		// must be declared ALL the method in that interface class.
		// for this example we use Lion and Dog Class. Lion and Dog Class will implements IAnimal Class that has 2 methods,
		// roar() and move()
		// the method in interface doesn't have any body because it only act as the interface,
		// while the child of the interface will define the body of that method based on the purpose

		Lion lion = new Lion();
		Dog dog = new Dog();

		System.out.println(lion.roar());
		System.out.println(lion.move());
		System.out.println(dog.roar());
		System.out.println(dog.move());

		// THE OTHER USE OF INTERFACE : Handle event in different Class
		// In this example, we will call the method "doSomething" in Animal Class
		// and handle the event of that method in Main Class (Class that call the "doSomething" method)

		// First, define a variable that hold the interface.
		// this variable later will handle the event
		Animal.OnCreateListener listener = new Animal.OnCreateListener(){
			@Override
			public void create(){
				// This line of code will be fired when we call method "doSomething" in Animal class
				System.out.println("Method \"doSomething\" is handled in another class (caller class)");
			}
		};

		// we pass the listener to the animal as the reference for Animal Class later.
		Animal animal = new Animal(listener);
		// we do something in the animal class
		animal.doSomething();
	}


}