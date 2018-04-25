

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{
    private static final String BEZEICHNUNG = "PCVideospiel";
    private AbstractVideospiel _videoSpiel;

    public PCVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
    }

    protected AbstractVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    
    @Test
    public void testberechneMietgebühr()
    {
    	Medium medium = getMedium();
    	assertEquals(medium.berechneMietgebuehr(1),Geldbetrag.get(200));
    	assertEquals(medium.berechneMietgebuehr(7),Geldbetrag.get(200));
    	assertEquals(medium.berechneMietgebuehr(12),Geldbetrag.get(700));
    	assertEquals(medium.berechneMietgebuehr(13),Geldbetrag.get(1200));
    	assertEquals(medium.berechneMietgebuehr(17),Geldbetrag.get(1200));
    }

}
