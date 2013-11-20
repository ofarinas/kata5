/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

/**
 *
 * @author usuario
 */
public class HistogramBuild<Colection> {
    Colection[]colection ;

    public HistogramBuild(Colection[] colection) {
        this.colection = colection;
    }

    public<A> Histogram<A> build(AtributeExtractor<Colection,A>extractor ){
        Histogram<A>histograma=new Histogram<>();
        for (Colection item : colection) {
            histograma.put(extractor.getDomain(item),histograma.get(extractor.getDomain(item))+1);
        }
        return histograma;
    }
    
}
