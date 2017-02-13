package JavaMVCModels;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ModelContext {
    public Model model;

    public ModelContext(Model model) {
        this.model = model;
    }

    public boolean writeData(String data) throws FileNotFoundException, IOException {
        return this.model.writeData(data);
    }

    public String getData() throws FileNotFoundException, IOException {
        return this.model.getData();
    }

    public Model getModel() {
        return model;
    } //observer

}
