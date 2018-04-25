
public class PCVideospiel extends AbstractVideospiel
{
	public PCVideospiel(String titel, String kommentar, String system)
	{
		super(titel,kommentar,system);
		
	}
	
	public int getPreisNachTagen(int tage)
	{	
		if(tage <= 7)
	{
		return 0;
	}
		else
		{
		return (int) ((tage-3)/5)*500;
	}
	}
	
	@Override
	public String getMedienBezeichnung()
	{
		return "PCVideospiel";
	}

}
