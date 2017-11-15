import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestMain {

    @Test
    public void testListSizeIsOK() {
        Main main = new Main();
        main.setField(new ArrayList());
        assertEquals(0, main.fieldSize());
    }

    @Test
    public void testListSizeStillOK() {
        Main main = new Main();
        assertEquals(0, main.fieldSize());
    }

    @Test
    public void testListSizeWithContent() {
        Main main = new Main();
        List list = new ArrayList<>();
        list.add("element");
        main.setField(list);

        assertEquals(1, main.fieldSize());
    }
}
