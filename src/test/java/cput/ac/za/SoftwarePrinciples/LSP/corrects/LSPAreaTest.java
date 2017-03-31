package cput.ac.za.SoftwarePrinciples.LSP.corrects;

import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class LSPAreaTest {
    Rectangle rects = new Rectangle();

    @Test
    public void testShape() throws Exception
    {
        rects.area(4,4,5);
    }
}
