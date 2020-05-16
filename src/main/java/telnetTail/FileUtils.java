package telnetTail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class FileUtils {

    private final static Logger log = Logger.getLogger(FileUtils.class.getName());

    public FileUtils() {
    }

    /*
    public void tailLogFile() throws InterruptedException {
        Observable<String> tailer;
        tailer = FileObservable.tailer()
                .file("application.log") // absolute path
                .tailText();

        tailer.subscribe(
                new Action1<String>() {
            public void call(String line) {
                System.out.println("you got line: " + line);
            }
        },
                new Action1<Throwable>() {
            public void call(Throwable e) {
                System.out.println("you got error: " + e);
            }
        }
        );
        Thread.sleep(120000);
    }
     */
    public void readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        log.info(resultStringBuilder.toString());
    }

    private InputStream getTwitterStream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
