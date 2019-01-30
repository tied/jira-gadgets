package ut.com.trustvesta.JIRA_Gadgets;

import org.junit.Test;
import com.trustvesta.JIRA_Gadgets.api.MyPluginComponent;
import com.trustvesta.JIRA_Gadgets.impl.MyPluginComponentImpl;

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