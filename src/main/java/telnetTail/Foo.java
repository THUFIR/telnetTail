package telnetTail;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Foo {

    private final static Logger log = Logger.getLogger(Foo.class.getName());

    public Foo() {
    }

    
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

    public void bar() {
        log.info("tail -f /var/log/syslog");

        //File file = new File("/var/log/syslog");
        File file = new File("/home/thufir/telnet/wuther.log");

        log.info(file.toString());
        /*
        Observable<String> newLines
                = FileObservable.tailer()
                        .file(file)
                        .startPosition(file.length())
                        .sampleTimeMs(1000)
                        .chunkSize(8192)
                        .utf8()
                        .tailText();

        newLines.subscribe(System.out::println);
         */
    }

}
