import java.util.Arrays;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.style.Styler.LegendPosition;

public class GraphsAndBars {

	public static void main(String[] args) {
		
		//Dataset
		int months[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int copiesSold[] = new int[] { 40, 39, 34, 29, 29, 25, 33, 35, 31, 30, 45, 30 };
		
		// Create Line Graph
		XYChart linegraph = new XYChartBuilder().width(800).height(600).title("Books Sold in 2022").xAxisTitle("Months").yAxisTitle("Copies Sold").build();
		
		// Series
		linegraph.addSeries("Copies Sold/Month", months, copiesSold);
		
		// Display it
		new SwingWrapper<XYChart>(linegraph).displayChart();
		
		//Dataset
		Integer overs[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		Integer runs[] = new Integer[] { 19, 23, 11, 21, 23, 16, 15, 9, 17, 12, 23, 15, 24, 6, 16, 11, 19, 14, 23, 16 };
		
		// Create Bar Chart
	    CategoryChart barchart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram").xAxisTitle("Overs").yAxisTitle("Runs").build();
	 
	    // Customize Bar Chart
	    barchart.getStyler().setLegendPosition(LegendPosition.InsideNW);
	 
	    // Series
	    barchart.addSeries("First Innings", Arrays.asList(overs), Arrays.asList(runs));
	    
	    // Display it
	    new SwingWrapper<CategoryChart>(barchart).displayChart();
	}
}