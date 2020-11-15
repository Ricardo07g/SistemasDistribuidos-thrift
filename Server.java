package valor;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;

import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class Server {
  public static void main(String[] args) {
    try {
      Controlador controle = new Controlador();
      Valor.Processor processor = new Valor.Processor(controle);
      TServerTransport Transport = new TServerSocket(9999);
      TServer server = new TSimpleServer(new Args(Transport).processor(processor));

      System.out.println("serviço Iniciado!");
      System.out.println("Para encerrar Pressione 'CTRL'+'C'.");
      server.serve();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
