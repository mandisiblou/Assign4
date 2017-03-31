package cput.ac.za.SoftwarePrinciples.LSP.violets;

import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class LSPAreaVioletsTest {
    Rectangle rects = new Rectangle();

    @Test
    public void testShape() throws Exception
    {
        rects.area(4,4,5);
    }
}
