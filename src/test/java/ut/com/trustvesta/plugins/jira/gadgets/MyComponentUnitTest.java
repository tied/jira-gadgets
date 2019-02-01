package ut.com.trustvesta.plugins.jira.gadgets;

import org.junit.Test;
import com.trustvesta.plugins.jira.gadgets.api.MyPluginComponent;
import com.trustvesta.plugins.jira.gadgets.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}