package JavaMVCModels;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Model {
	boolean writeData(String data) throws FileNotFoundException, IOException;
	String getData() throws FileNotFoundException, IOException;
} 
