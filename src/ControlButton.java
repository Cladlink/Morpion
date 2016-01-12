/**
 * Created by cladlink on 11/01/16.
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

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
                if (e.getSource()==plateau[i][j] && plateau[i][j].getIcon() == cartes[0])
                {
                    model.placeItem(plateau, cartes, i, j);
                    vue.setPlateau(plateau);
                    refresh();
                    if (model.checkVictory(plateau, cartes, i, j))
                    {
                        JOptionPane.showMessageDialog(vue, "victoire !");
                        vue.getInitAttribut();
                        refresh();
                    }
                }
            }
        }
    }
    private void refresh()
    {
        vue.repaint();
        vue.getCreerWidget();
        vue.setVisible(true);
    }
}