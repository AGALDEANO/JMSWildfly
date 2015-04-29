package core.image;

import javax.jms.JMSException;
import javax.naming.NamingException;

public class Demarrage {

	/**
	 * @param args
	 * @throws JMSException
	 */
	public static void main(String[] args) throws JMSException {
		// TODO Auto-generated method stub
		int nbm;
		System.out.println("Je d�marre  ");

		try {
			nbm = ProducteurImageJms.envoiImage();
			System.out.println("Nombre de messages envoy�s : " + nbm);
			System.out.println("EL'core.image a �t� envoy�e ");
			// production de core.message de type core.image

			System.out.println("Pour voir si l'core.image a �t� bien re�ue :");
			System.out.println(" Contr�lez <install_dir>/domains/domain1/logs/server.log.");

		} catch (JMSException e) {
			// TODO Auto-generated catch block
			System.out.println("erreur : " + e.getMessage());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println("erreur : " + e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("erreur : " + e.getMessage());
		}

	}
}
