import static org.junit.Assert.*;

import org.junit.Test;

public class VideospielTest {
	 private static final String KOMMENTAR = "Kommentar";
	    private static final String TITEL = "Titel";
	    private static final String BEZEICHNUNG = "Videospiel";
	    private static final String SYSTEM = "System";
	    private Videospiel _vs1;
	    private Videospiel _vs2;
	    
	public VideospielTest() {
		_vs1 = getMedium();
		_vs2 = getMedium();
	}

	private Videospiel getMedium()
	{
		return new Videospiel(TITEL,KOMMENTAR,SYSTEM);
	}
	
	 @Test
	    public void testGetMedienBezeichnung()
	    {
	        String videospielBezeichnung = BEZEICHNUNG;
	        assertEquals(videospielBezeichnung, _vs1.getMedienBezeichnung());
	    }

	    @Test
	    public void testKonstruktor()
	    {
	        assertEquals(TITEL, _vs1.getTitel());
	        assertEquals(KOMMENTAR, _vs1.getKommentar());
	        assertEquals(SYSTEM, _vs1.getSystem());
	    }

	    @Test
	    /*
	     * Von ein und dem selben Videospiel kann es mehrere Exemplare geben, die von
	     * unterschiedlichen Personen ausgeliehen werden können.
	     */
	    public void testEquals()
	    {
	        assertFalse("Mehrere Exemplare der gleichen CD sind ungleich",
	                _vs1.equals(_vs2));
	        assertTrue("Dasselbe Exemplare der gleichen CD ist gleich",
	                _vs1.equals(_vs1));
	    }

}
