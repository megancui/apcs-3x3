import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        char response;

        do {
            Scanner reader = new Scanner(System.in);

            System.out.println("Width: ");
            int width = reader.nextInt();

            System.out.println("Height: ");
            int height = reader.nextInt();

            int total = width * height;

            JFrame theGUI = new JFrame();
            JPanel[] thePanels = new JPanel[total];
            Container thePane = theGUI.getContentPane();
            Random rand = new Random();

            theGUI.setTitle("3x3 Project");
            theGUI.setSize(500, 500);
            theGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


            for (int i = 0; i < total; i++) {
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                Color randColor = new Color(r, g, b);

                JPanel thePanel = new JPanel();

                thePane.setLayout(new GridLayout(width, height));

                thePanel.setBackground(randColor);

                thePanels[i] = thePanel;

                thePane.add(thePanels[i]);
            }

            theGUI.setVisible(true);

            System.out.println("Run again? Y/N ");
            response = reader.next().charAt(0);
        }
        while (
                response == 'Y'
        );
    }
}
