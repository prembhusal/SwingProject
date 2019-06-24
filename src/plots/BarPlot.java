package plots;
import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarPlot {
	
	public static void addLineChart() {
		
		DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
	      line_chart_dataset.addValue( 15 , "schools" , "1970" );
	      line_chart_dataset.addValue( 30 , "schools" , "1980" );
	      line_chart_dataset.addValue( 60 , "schools" , "1990" );
	      line_chart_dataset.addValue( 120 , "schools" , "2000" );
	      line_chart_dataset.addValue( 240 , "schools" , "2010" ); 
	      line_chart_dataset.addValue( 300 , "schools" , "2014" );

	      JFreeChart lineChartObject = ChartFactory.createLineChart(
	         "Schools Vs Years","Year",
	         "Schools Count",
	         line_chart_dataset,PlotOrientation.VERTICAL,
	         true,true,false);

	      int width = 640;    /* Width of the image */
	      int height = 480;   /* Height of the image */ 
	      File lineChart = new File( "LineChart.jpeg" ); 
	      try {
			ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main( String[ ] args )throws Exception {
		
			addLineChart();
	      final String fait = "FAIT";              
	      final String audi = "AUDI";              
	      final String ford = "FORD";              
	      final String speed = "Speed";              
	      final String popular = "Popular";              
	      final String mailage = "Mailage";              
	      final String userrating = "User Rating";              
	      final String safety = "safety";        
	      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( ); 

	      dataset.addValue( 1.0 , fait , speed );              
	      dataset.addValue( 4.0 , fait , popular );              
	      dataset.addValue( 3.0 , fait , userrating );              
	      dataset.addValue( 5.0 , fait , mailage );              
	      dataset.addValue( 5.0 , fait , safety );              
	      
	      dataset.addValue( 5.0 , audi , speed );              
	      dataset.addValue( 7.0 , audi , popular );              
	      dataset.addValue( 6.0 , audi , userrating );              
	      dataset.addValue( 10.0 , audi , mailage );              
	      dataset.addValue( 4.0 , audi , safety ); 
	      
	      dataset.addValue( 4.0 , ford , speed );              
	      dataset.addValue( 3.0 , ford , popular );              
	      dataset.addValue( 2.0 , ford , userrating );              
	      dataset.addValue( 3.0 , ford , mailage );              
	      dataset.addValue( 6.0 , ford , safety );                 
	      
	      JFreeChart barChart = ChartFactory.createBarChart3D(
	         "Car Usage Statistics",             
	         "Category",             
	         "Score",             
	         dataset,            
	         PlotOrientation.VERTICAL,             
	         true, true, false);
	         
	      int width = 640; /* Width of the image */              
	      int height = 480; /* Height of the image */                              
	      File barChart3D = new File( "barChart3D.jpeg" );                            
	      ChartUtilities.saveChartAsJPEG( barChart3D, barChart, width, height);
	   }
}
