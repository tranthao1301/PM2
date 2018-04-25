
public abstract class AbstractMedium 
{
protected String _titel;
protected String _kommentar;
protected final int _tagesMietgebuehr;

public AbstractMedium(String titel, String kommentar)
{
	 assert titel != null : "Vorbedingung verletzt: titel != null";
     assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
	_titel = titel;
	_kommentar = kommentar;
	_tagesMietgebuehr = 300;
}

public String getTitel()
{
	return _titel;
}
public abstract String getMedienBezeichnung();

public String getKommentar()
{
	return _kommentar;
}

public void setKommentar(String kommentar)
{
	 assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
     _kommentar = kommentar;
}

public void setTitel(String titel)
{
	 assert titel != null : "Vorbedingung verletzt: titel != null";
     _titel = titel;
}

public String getFormatiertenString()
{
	return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
            + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    ";
}

public Geldbetrag berechneMietgebuehr(int mietTage)
{	
	assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
	return Geldbetrag.get(_tagesMietgebuehr * mietTage);
	
}
}
