package valor;

import valor.*;
import java.util.HashMap;
import org.apache.thrift.TException;



public class Controlador implements Valor.Iface {
  private HashMap<Integer, String> Hash = new HashMap<>();

  @Override
  public String getItem(int I) throws TException {
    if(Hash.containsKey(I)){
      return Hash.get(I);
    }
    else{ 
      throw new KeyNotFound();
    }
  }

  @Override
  public void delItem(int key) throws TException {
    Hash.remove(key);
  }

  @Override
  public String setItem(int key, String Value) throws TException {
    try {
      String Valor_Anterior = getItem(key);
      Hash.put(key, Value);
      return Valor_Anterior;
    } catch (KeyNotFound e) {
      Hash.put(key, Value);
      return "Não Encontramos O Valor Desejado.";
    } catch (Exception f) {
      throw f;
    }
  }

}
