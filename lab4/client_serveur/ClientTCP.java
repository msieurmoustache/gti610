import java.net;
import java.util.scanner;

public class ClientTCP {

	Socket clientSocket;
	public ClientTCP(String ip, int portNumber) {

		openSocket(ip, portNumber);
		exchangeData();
		closeSockets();


	}

	public void closeSockets() {
		try {
			clientSocket.close();
		} catch (IOException e) { System.out.println(e); }

	}

	public void openSocket(int portNumber) {
		try {
			Socket clientSocket = new Socket(serverIP/Name, serverPort);
		} catch (IOException e) { System.out.println(e); }

	}

	public void exchangeData() {
		int MAXLENGTH=256;
		byte[ ] buff = new byte[MAXLENGTH];
		try {
			InputStream in = clientSocket.getInputStream();
			in.read(buff);
		} catch (IOException e) {System.out.println(e);}

	}

}

