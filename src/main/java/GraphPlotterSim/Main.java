package GraphPlotterSim;
import GraphPlotterSim.EnterenceScreen.Screen;
import GraphPlotterSim.SelectionScreen.SelectionScreenFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            //Screen frame = new Screen();
            SelectionScreenFrame selectionScreenFrame = new SelectionScreenFrame(10);
            selectionScreenFrame.setVisible(true);
        });
    }

}