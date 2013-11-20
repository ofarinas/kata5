/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MockMailLoader implements Loader<Mail> {

    @Override
    public Mail[] load() {
 
 ArrayList<Mail> list = new ArrayList<>();
         list.add(new Mail("prueba0@gmail.com"));
         list.add(new Mail("prueba@hotmail.com"));
         list.add(new Mail("prueba@yahoo.es"));
         list.add(new Mail("prueba1@gmail.com"));
         list.add(new Mail("prueba2@gmail.com"));
         return list.toArray(new Mail[0]);
    }
    
}
