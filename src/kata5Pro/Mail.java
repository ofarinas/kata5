/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

/**
 *
 * @author usuario
 */
public class Mail {
private String address;

    public Mail(String address) {
        this.address = address;
    }
  public String getDomain(){
  return address.split("@")[1];
  }
  
  
}
