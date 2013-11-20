/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Histogram<T> extends HashMap<T,Integer> {
    @Override
    public Integer get(Object item){
     return this.containsKey((T) item) ? super.get(item):0;
}   
}
