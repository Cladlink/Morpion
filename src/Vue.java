/**
 * Created by cladlink on 11/01/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Vue extends JFrame
{
    private JButton[][] plateau;
    private ImageIcon[] cartes =
            {
                new ImageIcon(getClass().getResource("Img/Vide.png")),
                new ImageIcon(getClass().getResource("Img/Croix.png")),
                new ImageIcon(getClass().getResource("Img/Rond.png")),
            };
    private JPanel pano;
    public Vue(Model model)
    {
        InitAttribut();
        CreerWidget();

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void InitAttribut()
    {
        plateau = new JButton[3][3];
    }
    private void CreerWidget()
    {
        pano = new JPanel(new GridLayout(3, 3));
        for (int i=0; i<plateau.length;i++)
        {
            for (int j=0; j<plateau[i].length;j++)
            {
                plateau[i][j]= new JButton(cartes[0]);
                pano.add(plateau[i][j]);
            }
        }
        setContentPane(pano);
    }
}
