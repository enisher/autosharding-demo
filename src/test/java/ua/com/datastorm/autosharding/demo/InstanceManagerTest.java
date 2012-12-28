package ua.com.datastorm.autosharding.demo;

import org.junit.Test;

/**
 * @author <a href="mailto:enisher@gmail.com">Artem Orobets</a>
 */
public class InstanceManagerTest {
    @Test
    public void testInit() throws Exception {

    }

    @Test
    public void testStartup() throws Exception {
        final InstanceManager inst = new InstanceManager();
        inst.startup();
    }

    @Test
    public void testShutdown() throws Exception {

    }

    @Test
    public void testDrop() throws Exception {

    }
}
