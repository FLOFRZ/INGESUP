import com.sun.security.ntlm.Client;
import model.*;

import dao.ClientManager;
public class Main {
	public static void main(String[] args) {
		
		model.Client c = ClientManager.loadClientByID(1);
		System.out.println(c.toString());
		//model.Client c2 = new model.Client("client", "client", "flo", "123456");
		ClientManager.delClient(2);
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}