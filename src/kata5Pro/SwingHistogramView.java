/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5Pro;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class SwingHistogramView <T>   implements HistogramViewer {
    Histogram<T>SetHistogram;
   @Override
    public void show(Histogram set) {
    this.SetHistogram=set;
   ApplicationFrame mainFrame=new ApplicationFrame("HIstogram");
   mainFrame.add(createComponent());
   mainFrame.pack();
   mainFrame.setVisible(true);
   }       
    
   
    public ChartPanel createComponent(){
    ChartPanel chartPanel=new ChartPanel(createJfreChart());
    return chartPanel;
    }

    private JFreeChart createJfreChart(){
        JFreeChart jfreeChart=ChartFactory.createBarChart("Histogram","Domain","Frecuncy",createDataSet()); 
         return jfreeChart;
    }

    private CategoryDataset createDataSet() {
       DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        for (T item : SetHistogram.keySet()) {
            dataset.addValue(SetHistogram.get(item),"Domain", (String)item);
        }
        return dataset;
    }

    
    }
    

