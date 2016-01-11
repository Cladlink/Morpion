/**
 * Created by cladlink on 11/01/16.
 */
import javax.swing.*;
import java.awt.event.*;

public class ControlButton extends Control implements ActionListener
{
    JButton[][] plateau = vue.getPlateau();
    ImageIcon[] cartes = vue.getCartes();

    public ControlButton(Model model, Vue vue)
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
                    System.out.println(plateau[i][j].getIcon());
                }
            }
        }
        vue.setPlateau(plateau);
        vue.repaint();
        vue.creerWidget();
        vue.setVisible(true);
    }
}