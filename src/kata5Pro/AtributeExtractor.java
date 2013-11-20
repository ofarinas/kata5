/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

/**
 *
 * @author usuario
 */
public interface AtributeExtractor<Entity,Atribute> {
    public Atribute getDomain(Entity entity);
}
