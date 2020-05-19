import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		String url = "http://0.0.0.0:8686/"; // para acessar fora de localhost
		Endpoint.publish(url, new BanqueService());
		System.out.println("Web Service d�ploy� sur: "+url);
	}

}
