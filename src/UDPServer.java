import java.io.IOException;
import java.net.*;

/**
 *
 * @author hp
 */
public class UDPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException  {
        // TODO code application logic here
        byte[] buffer = {10,23,12,31,43,32,24};
        InetAddress address = InetAddress.getByName("192.168.230.1");
        DatagramPacket packet = new DatagramPacket(
                buffer, buffer.length, address, 57
        );
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(packet);
        System.out.println(InetAddress.getLocalHost().getHostAddress());


    }
}