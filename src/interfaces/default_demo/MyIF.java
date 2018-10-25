package interfaces.default_demo;

public interface MyIF {

	int getNumber();
	
	default String getString() {
		return "Default String";
	}
}
