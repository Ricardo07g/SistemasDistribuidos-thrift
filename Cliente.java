package valor;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;

public class Cliente {
  public static void main(String[] args) {
    try {
      TTransport transport = new TSocket("127.0.0.1", 9999);
      transport.open();

      TProtocol protocol = new TBinaryProtocol(transport);
      Valor.Client cliente = new Valor.Client(protocol);
      String valorAntigo = cliente.setItem(7, "Valor atribuido a chave é 7");
      System.out.println("Valor antigo = " + valorAntigo);

      System.out.println("Valor = " + cliente.getItem(7));
      System.out.println("Apagando valor...");

      cliente.delItem(7);
      System.out.println("Valor = " + cliente.getItem(7));

      transport.close();
    } catch (TException e) {
      e.printStackTrace();
    }
  }
}
