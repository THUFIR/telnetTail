package telnetTail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class App {

    private final static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException {
        InputStream bar = new FileInputStream("/var/log/syslog");
        new FileUtils().readFromInputStream(bar);
    }
}
