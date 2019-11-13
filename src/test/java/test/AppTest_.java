
package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.BDDMockito.*;

/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest_
{
    @MockBean
    private ISource source;

    @Autowired
    private TestClass testObject;

    @Test
    public void Test1()
    {
        given(source.getData()).willReturn("test");
        String test = testObject.test();
        assertThat(test).isEqualTo("test_hello");
    }
}
