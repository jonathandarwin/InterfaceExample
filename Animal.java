public class Animal{

	OnCreateListener listener;

	public Animal(OnCreateListener listener){
		// Listener that is passed to this constructor will be saved as an attribute
		this.listener = listener;
	}

	public void doSomething(){
		// listener here is refer to the listener in Main class because
		// Main class pass the listener in the constructor before.
		// here, we call listener.create(), which is refer to listener in Main class
		listener.create();
	}

	// Define interface in this class
	// this interface will connect the Animal and Main class
	public interface OnCreateListener{
		void create();
	}
}