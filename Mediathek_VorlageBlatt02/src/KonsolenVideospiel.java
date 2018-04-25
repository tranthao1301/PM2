
public class KonsolenVideospiel extends AbstractVideospiel
{
	public KonsolenVideospiel(String titel, String kommentar, String system)
	{
		super(titel,kommentar,system);
	}

	public int getPreisNachTagen(int tage)
	{
		int result = (int) (tage/3)*700;
		return result;
	}
	
	@Override
	public String getMedienBezeichnung()
	{
		return "KonsolenVideospiel";
	}
}
