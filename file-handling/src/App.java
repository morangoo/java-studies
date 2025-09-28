import java.io.File;
//import java.io.IOException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Filey myFile = new Filey("teste");
        System.out.println(myFile.getFileName());
        if (myFile.createFile()) {
            System.out.println("File created!");
        }
    }
}

class Filey {
    private final File file;

    Filey(String filename) {
        this.file = new File(filename + ".txt");
    }

    public String getFileName() {
        return this.file.getName();
    }

    public boolean createFile() throws IOException {
        try {
            return this.file.createNewFile();
        } catch (IOException e) {
            //e.printStackTrace();
            return false;
        }
    }
}