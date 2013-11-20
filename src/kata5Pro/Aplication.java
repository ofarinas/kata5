/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

/**
 *
 * @author usuario
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
  CreateHIstogramControl<Mail,String> control = new CreateHIstogramControl<>(
                new MockMailLoader(), new SwingHistogramView(), createAtributeExtraxtor());
  control.execute();
    }

    private static AtributeExtractor<Mail, String> createAtributeExtraxtor() {
        return new AtributeExtractor<Mail, String>() {
            @Override
            public String getDomain(Mail entity) {
           return entity.getDomain(); 
            }
        };

    }
}
