public class Lion implements IAnimal{

	// This 2 methods must be implemented because
	// the Lion class implement IAnimal interface which is has this 2 methods
	@Override
	public String roar(){
		return "AUMM!";
	}

	@Override
	public String move(){
		return "Lion is moving";
	}
}