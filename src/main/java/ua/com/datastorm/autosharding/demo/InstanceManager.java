package ua.com.datastorm.autosharding.demo;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 * @author <a href="mailto:enisher@gmail.com">Artem Orobets</a>
 */
public class InstanceManager {

    private String instanceHome;

    public InstanceManager() {
        instanceHome = "..\\releases\\orientdb-1.4.0-SNAPSHOT";
    }

    public void init() {

    }

    public void startup() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "start", "aserver.bat")
                .directory(new File(instanceHome + "\\bin"))
                .start();
    }

    public void shutdown() {

    }

    public void drop() {

    }
}
