/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

/**
 *
 * @author usuario
 */
public class ConsoleHistogramViewer implements HistogramViewer {

    @Override
    public <Entity> void show(Histogram<Entity> set) {
        for (Entity item : set.keySet()) {
            System.out.println(item + ":" + set.get(item));

        }
    }
}
