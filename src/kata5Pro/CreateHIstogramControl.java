/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

/**
 *
 * @author usuario
 */
public class CreateHIstogramControl<Entity,A> {
    
    Loader<Entity>Mailloader;
    HistogramViewer viewer;
    AtributeExtractor<Entity, A>extractor;

    public CreateHIstogramControl(Loader<Entity> Mailloader, HistogramViewer viewer, AtributeExtractor<Entity, A> extractor) {
        this.Mailloader = Mailloader;
        this.viewer = viewer;
        this.extractor = extractor;
    }
    
    
    public void execute(){
          HistogramBuild histogramBuilder=new HistogramBuild(Mailloader.load());
          viewer.show(histogramBuilder.build(extractor));
    }
}
