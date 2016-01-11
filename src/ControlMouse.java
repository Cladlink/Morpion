/**
 * Created by cladlink on 11/01/16.
 */
import javax.swing.*;
import java.awt.event.*;

public class ControlMouse extends Control implements ActionListener
{
    JButton[][] plateau = vue.getPlateau();
    ImageIcon[] cartes = vue.getCartes();

    public ControlMouse(Model model, Vue vue)
    {
        super(model, vue);
        vue.setButControler(this);
    }
    public void actionPerformed(ActionEvent e)
    {

        for(int i=0;i<plateau.length;i++)
        {
            for(int j=0;j<plateau[i].length;j++)
            {
                if (e.getSource()==plateau[i][j])
                {
                    plateau[i][j]=new JButton(cartes[2]);
                    System.out.println("a");
                }
            }
        }
        vue.setPlateau(plateau);
        vue.repaint();
        vue.getCreerWidget();
        vue.setVisible(true);
    }
}
