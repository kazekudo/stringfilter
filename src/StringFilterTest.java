import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.Test;
import java.lang.*;

public class StringFilterTest {

    @Test
    public void upperCaseStringFilter() {
        String input = "toto";
        StringFilter filter = new UpperCaseStringFilter();
        String output = filter.filter(input);
        assertThat(output, equalTo("TOTO"));
    }

    @Test
    public void lowerCaseStringFilter() {
        String input = "TOTO";
        StringFilter filter = new LowerCaseStringFilter();
        String output = filter.filter(input);
        assertThat(output, equalTo("toto"));
    }

    @Test
    public void prefixStringFilter() {
        String input = "toto";
        StringFilter filter = new PrefixStringFilter(2);
        String output = filter.filter(input);
        assertThat(output, equalTo("to"));
    }

    @Test
    public void postfixStringFilter() {
        String input = "toto";
        StringFilter filter = new PostfixStringFilter(3);
        String output = filter.filter(input);
        assertThat(output, equalTo("to"));
    }

    @Test
    public void asciiStringFilter() {
        String input = "aeiçouérrr";
        StringFilter filter = new AsciiStringFilter();
        String output = filter.filter(input);
        assertThat(output, equalTo("aeiourrr"));
    }

    @Test
    public void filterTest() {
        String[] input = {"test","2test"};
        StringFilter filter = new PrefixStringFilter(3);
        String[] output = Main.filter(input,filter);
        assertThat(output[0], equalTo("tes"));
        assertThat(output[1], equalTo("2te"));

    }

    @Test
    public void CompositeStringFilter() {
        String input = "aeiçouérrr";
        StringFilter filter = new CompositeStringFilter(new StringFilter[]{new AsciiStringFilter(), new PrefixStringFilter(6)});
        String output = filter.filter(input);
        assertThat(output, equalTo("aeiour"));

    }

}
