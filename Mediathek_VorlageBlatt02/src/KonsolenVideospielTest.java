

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{
    private static final String BEZEICHNUNG = "KonsolenVideospiel";
    private static final String SYSTEM = "System";
    private AbstractVideospiel _videoSpiel;

    public KonsolenVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    @Test
    public void testeVideospiel()
    {
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
    }

    @Override
    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Override
    public void testeberechneMietgebuehr()
    {
    	Medium medium = getMedium();
    	assertEquals(medium.berechneMietgebuehr(1),Geldbetrag.get(200));
    	assertEquals(medium.berechneMietgebuehr(3),Geldbetrag.get(900));
    	assertEquals(medium.berechneMietgebuehr(5),Geldbetrag.get(900));
    	assertEquals(medium.berechneMietgebuehr(7),Geldbetrag.get(1600));
    }

}
