package sorter;

import java.util.ArrayList;
import javax.swing.JFrame;
import sorter.algos.ISortAlgorithm;
import sorter.algos.BubbleSort;
import static SleepPackage.Sleep.secondsToNano;
import static SleepPackage.Sleep.sleepFor;

public class SortVisualizer {
	private final JFrame window;
	private final SortArray sortArray;
	private final ArrayList<ISortAlgorithm> sortQueue;
	
	public SortVisualizer() {
		window = new JFrame("Sort Visualizer");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sortArray = new SortArray();
		window.add(sortArray);
		window.pack();
		window.setVisible(true);
		
		sortQueue = new ArrayList<>();
		sortQueue.add(new BubbleSort());
	}
	
	private void shuffleAndWait() {
		sortArray.shuffle();
		sortArray.resetColours();
		sleepFor(secondsToNano(2));
	}
	public void run() {
		for(ISortAlgorithm algorithm : sortQueue) {
			sleepFor(secondsToNano(1));
			shuffleAndWait();
			algorithm.runSort(sortArray);
			System.out.println("INFLAMARNAE");
			sortArray.resetColours();
			sortArray.highlightArray();
			sortArray.resetColours();
		}
	}
	public static void main(String... args) {
		SortVisualizer sortVisualizer = new SortVisualizer();
		sortVisualizer.run();
	}
}
