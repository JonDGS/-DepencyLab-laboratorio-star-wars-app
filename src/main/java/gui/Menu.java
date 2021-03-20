package gui;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;



public class Menu {
    public void startMenu(String[][] list){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Star Wars Characters Info pero en Azul", TitledBorder.CENTER, TitledBorder.TOP));
        String[] header = { "Name", "Height", "Birth Year " };
        JTable table = new JTable(list, header);
        panel.add(new JScrollPane(table));
        frame.add(panel);
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }
}
