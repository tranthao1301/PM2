import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{
	/**
	 * Textrepräsentation für das Ereignis Ausleihe
	 */
	public static final String EREIGNIS_AUSLEIHE = "Ausleihe";

	/**
	 * Textrepräsentation für das Ereignis Rückgabe
	 */
	public static final String EREIGNIS_RUECKGABE = "Rückgabe";

	/**
	 * Pfad der Datei, in die das Verleihprotokoll geschrieben wird
	 */
	private static final String DATEIPFAD = "./verleihProtokoll.txt";

	/**
	 * Schreibt eine übergebene Verleihkarte ins Protokoll.
	 * 
	 * @param ereignis
	 *            Der Name des Verleihereignis: mögliche Namen sind durch die
	 *            Konstanten EREIGNIS_AUSLEIHE und EREIGNIS_RUECKGABE definiert.
	 * @param verleihkarte
	 *            eine Verleihkarte, die das Verleihereignis betrifft.
	 * 
	 * @require EREIGNIS_AUSLEIHE.equals(ereignis) ||
	 *          EREIGNIS_RUECKGABE.equals(ereignis)
	 * @require verleihkarte != null
	 * 
	 * @throws ProtokollierException
	 *             wenn das Protokollieren nicht geklappt hat.
	 */
	public void protokolliere(String ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
		// assert EREIGNIS_AUSLEIHE.equals(ereignis)
		// || EREIGNIS_RUECKGABE.equals(ereignis) : "Vorbedingung verletzt:
		// EREIGNIS_AUSLEIHE.equals(ereignis)|| EREIGNIS_RUECKGABE.equals(ereignis)";
		// assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte != null";

		String eintrag = Datum.heute().toString() + ": " + ereignis + "\n" + verleihkarte.getFormatiertenString();
		// System.out.println(eintrag);

		try (FileWriter writer = new FileWriter(DATEIPFAD, true))
		{
			writer.write(eintrag);
//			writer.close();
		} catch (IOException e)
		{
			// System.err.println("Beim Schreiben des Verleihprotokolls ist ein Fehler
			// aufgetreten!");
			throw new ProtokollierException("Beim Schreiben des Verleihprotokolls ist ein Fehler aufgetreten!");
		}
	}

	public enum VerleihEreignis
	{
		AUSLEIHE, RUECKGABE
	}

	public void protokolliere(VerleihEreignis ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
		assert ereignis != null : "Vorbedingung verletzt: ereignis != null";
		assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte != null";
		protokolliere(ereignis.name(), verleihkarte);
	}
}
