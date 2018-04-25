

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public abstract class AbstractVideospielTest extends AbstractMediumTest
{
    protected static final String SYSTEM = "System";
    private AbstractVideospiel _videoSpiel;

    public AbstractVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    @Test
    public void testeAbstractVideospiel()
    {
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Override
    protected abstract AbstractVideospiel getMedium();

}
