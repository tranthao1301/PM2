

import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        String showText = "";
        
        for(Medium medium : medien)
        {
//        	if(medium instanceof CD)
//        	{
//        		showText += "CD";
//        	}
//        	else if(medium instanceof DVD)
//        	{
//        		showText += "DVD";
//        	}
//        	else if(medium instanceof Videospiel)
//        	{
//        		showText += "Videospiel";
//        	}
//        	showText += "\n" + medium.getTitel();
        	
        	showText = medium.getFormatiertenString();	
        }
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        selectedMedienTextArea.setText(showText);
    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
