import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AbstractMediumTest
{
	 protected static final String KOMMENTAR = "Kommentar";
	 protected static final String TITEL = "Titel";
	 protected static final int MIETGEBUEHR_PRO_TAG = 300;
	 private AbstractMedium _medium;
	 private AbstractMedium _medium2;
	 
	 public AbstractMediumTest()
	 {
		_medium = getMedium(); 
		_medium2 = getMedium();
	 }
	@Test
	public void testAbstractMedium()
	{
		assertEquals(TITEL, _medium.getTitel());
        assertEquals(KOMMENTAR, _medium.getKommentar());
	}
	
	
    protected abstract AbstractMedium getMedium();
	
	@Test
	public void testeberechneMietgebuehr()
	{
		 assertEquals(Geldbetrag.get(MIETGEBUEHR_PRO_TAG),_medium.berechneMietgebuehr(1));
	     assertEquals(Geldbetrag.get(2 * MIETGEBUEHR_PRO_TAG),_medium.berechneMietgebuehr(2));
	     assertEquals(Geldbetrag.get(7 * MIETGEBUEHR_PRO_TAG),_medium.berechneMietgebuehr(7));
	}
	
	@Test
	public void testEquals()
	{
		assertFalse("Mehrere Exemplare des gleichen Mediums sollten ungleich",_medium.equals(_medium2));
        assertTrue("Dieselben Exemplare des gleichen Mediums sollten gleich",_medium.equals(_medium));
	}
	
	@Test
    public final void testGetFormatiertenString()
    {
		assertNotNull(_medium.getFormatiertenString());
    }
	
	@Test
    public final void testSetTitel()
    {
        _medium.setTitel("Titel2");
        assertEquals(_medium.getTitel(), "Titel2");
    }
	
	@Test
	public final void testSetKommentar()
	{
        _medium.setKommentar("Kommentar2");
        assertEquals(_medium.getKommentar(), "Kommentar2");
    }
	
	@Test
    public abstract void testGetMedienBezeichnung();
}
